package util;


import org.apache.commons.lang3.StringUtils;
import pojo.ProjectFile;
import pojo.StartupConfig;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileCodder {

    XmlParser xmlParser;
    StartupConfig config;
    String projectName;
    String[] packageNameSplit;


    protected void generateSupportFiles(String parentDir) throws Exception {
        Files.createDirectories(Paths.get(parentDir + "src"));
        //pom.xml
        String pomPath = parentDir + "src" + File.separator + "pom.xml";
        createFile(pomPath);
        writeFileContents(SupportFilesInfo.POM_CONTENTS, pomPath);

        //readme.md
        String readmePath = parentDir + "src" + File.separator + "readme.md";
        createFile(readmePath);
        writeFileContents(SupportFilesInfo.READMEMD_FILE, readmePath);

        //readme.md
        String mvnCmd = parentDir + "src" + File.separator + "mvnw.cmd";
        createFile(mvnCmd);
        writeFileContents(SupportFilesInfo.MVNCMD_FILE, mvnCmd);

        //readme.md
        String mvnwExec = parentDir + "src" + File.separator + "mvnw";
        createFile(mvnwExec);
        writeFileContents(SupportFilesInfo.MVNW_EXEC_FILE, mvnwExec);
    }

    protected void generateTestsFolder(String parentDir) throws Exception {
        String parentCodeDir = "src" + File.separator + "test" + File.separator;
        String codeDir = parentCodeDir
                + "java"
                + File.separator
                + packageNameSplit[0]
                + File.separator
                + packageNameSplit[1]
                + File.separator
                + packageNameSplit[2]
                + File.separator;

        String projectName = new XmlParser()
                .readConfig()
                .getProjectPackage()
                .split("[.]")[2];

        String fileDir = "";
        //Path path;

        String filePath = parentDir + codeDir + fileDir;

        //path = ;
        Files.createDirectories(Paths.get(filePath));

        String packageName = ("package " + config.getProjectPackage() + ";\n\n");

        String testBasicImports = "import org.junit.jupiter.api.Test;\n" +
                "import org.springframework.boot.test.context.SpringBootTest;\n";

        StringBuilder testMainFileSB = new StringBuilder();
        testMainFileSB.append(packageName)
                .append("\n")
                .append(testBasicImports)
                .append("\n")
                .append("@SpringBootTest\n")
                .append("public class ")
                .append(StringUtils.capitalize(projectName))
                .append("Test {\n")
                .append("\t@Test\n" +
                        "\tvoid contextLoads() {\n" +
                        "\t}\n" +
                        "\n" +
                        "}\n");

        StringBuilder testFileNameSB = new StringBuilder();

        testFileNameSB.append(StringUtils.capitalize(projectName))
                .append("ApplicationTest")
                .append(".java");

        writeFileContents(testMainFileSB.toString(), filePath + (testFileNameSB.toString()));

    }

    private void createMainFile(String filePath) throws Exception {

        String projectName = new XmlParser()
                .readConfig()
                .getProjectPackage()
                .split("[.]")[2];


        String imports = "import org.springframework.boot.SpringApplication;\n" +
                "import org.springframework.boot.autoconfigure.SpringBootApplication;";

        StringBuilder mainFile = new StringBuilder();
        mainFile.append("package ")
                .append(projectName)
                .append(";\n")
                .append(imports)
                .append("\n")
                .append("@SpringBootApplication\n")
                .append("public class ")
                .append(StringUtils.capitalize(projectName))
                .append("Application {\n")
                .append("public static void main(String[] args) {\n")
                .append("\t\tSpringApplication.run(")
                .append(StringUtils.capitalize(projectName))
                .append("Application.class , args);\n")
                .append("\t}")
                .append("\n}\n");

        StringBuilder fileNameSB = new StringBuilder();

        fileNameSB.append(StringUtils.capitalize(projectName))
                .append("Application")
                .append(".java");

        writeFileContents(mainFile.toString(), filePath + (fileNameSB.toString()));
    }

    protected void generateResourcesFolder(String parentDir) throws Exception {
        String parentResourcesDir = parentDir +File.separator+ "src" + File.separator + "main" + File.separator + "resources";
        Files.createDirectories(Paths.get(parentResourcesDir));

        //application.properties
        String applicationDotPropertiesPath = parentResourcesDir + File.separator + "application.properties";
        createFile(applicationDotPropertiesPath);
        writeFileContents("#declare your props in here", applicationDotPropertiesPath);

        //static
        String staticDir = parentResourcesDir +File.separator+ "static" + File.separator + "init.txt";
        createFile(staticDir);
        Files.createDirectories(Paths.get(parentResourcesDir +File.separator+ "static"));
        writeFileContents("//add all your static files in here", staticDir);

        //templates
        String templatesDir = parentResourcesDir +File.separator+ "templates" + File.separator + "init.txt";
        createFile(templatesDir);
        Files.createDirectories(Paths.get(parentResourcesDir +File.separator+ "templates"));
        writeFileContents("//add all your templates files in here", templatesDir);
    }

    public FileCodder(String input, String className) throws Exception {
        xmlParser = new XmlParser();
        config = xmlParser.readConfig();
        projectName = config.getProjectPackage();
        packageNameSplit = projectName.split("[.]");

        String parentDir = "output" + File.separator + packageNameSplit[2] + File.separator;
        String parentCodeDir = "src" + File.separator + "main" + File.separator;

        String codeDir = parentCodeDir
                + "java"
                + File.separator
                + packageNameSplit[0]
                + File.separator
                + packageNameSplit[1]
                + File.separator
                + packageNameSplit[2]
                + File.separator;

        String fileDir = "";
        Path path;

        //check and see where each file belongs here
        if (input.contains("@RequestMapping")) {
            fileDir = "controller" + File.separator;
        } else if (input.contains("@Entity")) {
            fileDir = "entities" + File.separator;
        } else if (input.contains("<?xml")) {
            fileDir = "resources" + File.separator;
        } else {
            fileDir = "models" + File.separator;
        }

        String filePath = parentDir + codeDir + fileDir;

        path = Paths.get(filePath);
        Files.createDirectories(path);

        String packageName = ("package "
                + config.getProjectPackage()
                + "." + fileDir
                + ";\n\n")
                .replace(File.separator, "");

        String javaCode = packageName + input;
        String fileNameAndPath = filePath + className.trim() + ".java";
        createFile(fileNameAndPath);
        writeFileContents(javaCode, fileNameAndPath);
        createMainFile(parentDir + codeDir + File.separator);

        ProjectFile projectFile = new ProjectFile();
        projectFile.setFileName(className.trim()+".java");
        projectFile.setClassName(className.trim());
        projectFile.setContents("");
        projectFile.setPackageName(packageName);

        generateSupportFiles(parentDir);
        generateTestsFolder(parentDir);
        generateResourcesFolder(parentDir);

        createController(projectFile,parentDir +codeDir);
    }

    private void createController(ProjectFile projectFile, String parentDir)  throws Exception{
        String controllerPath = parentDir + "controller";
        Files.createDirectories(Paths.get(controllerPath));
        ControllerGenerator controllerGenerator = new ControllerGenerator(projectFile);
        String fileNameAndPath = controllerPath+File.separator+projectFile.getFileName().replace(".java","Controller.java");
        createFile(fileNameAndPath);
        writeFileContents(controllerGenerator.getControllerBody(),fileNameAndPath);
    }


    private void writeFileContents(String input, String fileNameAndPath) {
        try {
            FileWriter myWriter = new FileWriter(fileNameAndPath);
            myWriter.write(input);
            myWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private void createFile(String fileNameAndPath) throws Exception {

        File file = new File(fileNameAndPath);
        try {
            boolean value = file.createNewFile();
            if (value) {
//                System.out.println("New Java File is created.");
            } else {
//                System.out.println("The file already exists.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
