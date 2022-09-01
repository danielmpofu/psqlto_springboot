package util;


import org.apache.commons.lang3.StringUtils;
import pojo.StartupConfig;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCodder {

    private final String input;
    private final String className;
    private final String filePath;

    public FileCodder(String input, String className) throws Exception {
        this.input = input;
        this.className = className.trim();

        XmlParser xmlParser = new XmlParser();
        StartupConfig config = xmlParser.readConfig();
        String projectName = config.getProjectPackage();
        String[] p = projectName.split("[.]");

        String parentDir = "output\\" + p[2] + "\\";
        String codeDir = "src\\main\\java\\" + p[0] + "\\" + p[1] + "\\" + p[2]+"\\";

        String fileDir = "";
        Path path;

        if (input.contains("@RequestMapping")) {
            fileDir = "controllers\\";
        } else if (input.contains("@Entity")) {
            fileDir = "entities\\";
        } else {
            fileDir = "models\\";
        }

        filePath = parentDir + codeDir + fileDir;

        path = Paths.get(filePath);
        Files.createDirectories(path);
        String packageName = ("package "
                + config.getProjectPackage()
                + "." + fileDir
                + ";\n\n")
                .replace("\\", "");

        String javaCode = packageName+input;
        String fileNameAndPath = filePath + className.trim() + ".java";
        createFile(fileNameAndPath);

        writeJavaFile(javaCode, fileNameAndPath);
        createMainFile(parentDir + codeDir + "\\");
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

//        try {
//            FileWriter myWriter = new FileWriter(filePath + (fileNameSB.toString()));
//            myWriter.write(mainFile.toString());
//            myWriter.close();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }

        writeJavaFile(mainFile.toString(), filePath + (fileNameSB.toString()));
    }

    private void writeJavaFile(String input, String fileNameAndPath) {
        try {
            FileWriter myWriter = new FileWriter(fileNameAndPath);
            myWriter.write(input);
            myWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private void createFile(String fileNameAndPath) {
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
