package util;

import pojo.ProjectFile;
import pojo.StartupConfig;

import java.io.File;

public class ControllerGenerator {
    private String controllerImports = "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "import org.springframework.beans.factory.annotation.Autowired;\n" +
            "import org.springframework.http.HttpStatus;\n" +
            "import org.springframework.http.ResponseEntity;\n" +
            "import org.springframework.web.bind.annotation.GetMapping;\n" +
            "import org.springframework.web.bind.annotation.RequestMapping;\n" +
            "import org.springframework.web.bind.annotation.RequestParam;\n" +
            "import org.springframework.web.bind.annotation.RestController;\n";

    private ProjectFile projectFile;

    private String controllerBody;
    private String projectName;

    private String entityImport;

    String[] packageNameSplit;

    public ControllerGenerator(ProjectFile projectFile) throws Exception {
        this.projectFile = projectFile;
        XmlParser xmlParser = new XmlParser();
        StartupConfig config = xmlParser.readConfig();
        projectName = config.getProjectPackage();
        packageNameSplit = projectName.split("[.]");
        createControllerBody();
    }

    private void createControllerBody() {

        String classAnnotations = String.format("\n@RestController\n@RequestMapping(\"%s\")"
                , projectFile.getClassName().toLowerCase());

        entityImport = String.format("import %s.%s",projectFile.getPackageName(),projectFile.getClassName());

        StringBuilder controllerBodySB = new StringBuilder();

        controllerBodySB
                .append(projectFile.getPackageName().replace("entities","controller"))
                .append(controllerImports)
                .append(entityImport)
                .append(classAnnotations)
                .append("\n")
                .append("public class ")
                .append(projectFile.getClassName())
                .append("{\n}");

        this.controllerBody = controllerBodySB.toString();
    }

    public String getControllerBody() {
        return controllerBody;
    }
}
