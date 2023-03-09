package util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
import pojo.ProjectFile;
import pojo.StartupConfig;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PgSqlReader {
    private final String filePath;

    StartupConfig config;

    public PgSqlReader(String filePath) throws Exception {
        config = new XmlParser().readConfig();
        this.filePath = filePath;
    }

    public List<String> readFile() {
        File inputSqlFile = new File(filePath);
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(inputSqlFile);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String l = scanner.next().trim();
                if (!l.startsWith("--")) {
                    lines.add(l);
                }

            }

            return findCreateStatements(lines);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> findCreateStatements(List<String> lines) {
        List<String> createStatements = new ArrayList<>();
        for (String line : lines) {
            line = line.trim();
            if (line.contains("create table")) {
                createStatements.add(removeComments(line));
            }
        }

        try {
            createPOJO(createStatements, false);
            createPOJO(createStatements, true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return createStatements;
    }

    public String removeComments(String inputQuery) {

        StringBuilder stringBuilder = new StringBuilder();
        String[] querySplit = inputQuery.split(",");
        for (int i = 0; i < querySplit.length; i++) {


            if (!querySplit[i].contains("--")) {
                if (i != querySplit.length - 1) {
                    stringBuilder.append(querySplit[i]).append(",");
                } else {
                    stringBuilder.append(querySplit[i]);
                }
            } else {
                String f = querySplit[i];

                String[] s = f.split("\n");
                for (String x : s) {

                    if (!x.contains("--")) {
                        stringBuilder.append(x);
                    }
                }
            }
        }

        return stringBuilder.toString();
    }

    public void createPOJO(List<String> createStatements, boolean isEntity) throws Exception {

        for (int i = 0; i < createStatements.size(); i++) {
            String stm = createStatements.get(i).replace("create table ", "");

            stm = stm.replaceAll("[0-9]", "").replace("()", "");

            String[] tableNameAndData = stm.split("[(]");
            String className = underscoreToCamelCase(tableNameAndData[0], true);
            String classFields = tableNameAndData[1];

            String[] classFieldsArray = classFields.split(",");

            StringBuilder classData = new StringBuilder();



            classData.append(config.isUseLombok() ? "\nimport lombok.Data;\n" : "");
            StringBuilder classImports = new StringBuilder();
            String entityImports = "import java.util.Objects;\n" +
                    "import javax.persistence.Entity;\n" +
                    "import javax.persistence.GeneratedValue;\n" +
                    "import javax.persistence.Id;\n";

            classImports.append(isEntity ? entityImports : "");

            classData.append(entityImports);
            classData.append(isEntity ? "@Entity\n" : "");
            classData.append(config.isUseLombok() ? "@Data\n" : "");

            classData.append("public class ").append(className.trim()).append("\n{");

            for (String s : classFieldsArray) {
                classData.append(createVariables(s, isEntity));
            }
            classData.append("}");



            new FileCodder(classData.toString(), StringUtils.capitalize(className));

        }
    }

    String removeWhiteSpaces(String sm) {
        String[] fieldProps = sm.split("\\s+");
        StringBuilder sf = new StringBuilder();
        for (String s : fieldProps) {
            if (!s.isEmpty()) {
                sf.append(s);
                sf.append(" ");
            }
        }
        return sf.toString();
    }

    String createVariables(String source, boolean isEntity) {

        String[] fieldProps = removeWhiteSpaces(source).split(" ");

        String fieldName = fieldProps[0];
        String fieldType = fieldProps[1];
        String variableDataType = "";

        //something like private String name;
        StringBuilder fieldNameDeclaration = new StringBuilder();

        /* todo looking for the id
         some tables they come without the field named Id they be calling it maybe username or so ..
         id  varchar(255) unique primary key not null,
         can use anything with Unique identifier or primary key or anything..
         still an open issue
         can do better here
        */
        if (fieldName.equalsIgnoreCase("id") && isEntity) {
            fieldNameDeclaration.append(" \n@Id \n" +
                    "@GeneratedValue  \n" +
                    "@Column(name = \"").append(fieldName).append("\", nullable = false) \n");
        }

        fieldNameDeclaration
                .append("private ")
                .append(determineVariableType(fieldType));
        variableDataType = determineVariableType(fieldType);

        fieldNameDeclaration.append(underscoreToCamelCase(fieldName, false));
        //terminate the variable
        fieldNameDeclaration.append(";\n");
        if (!config.isUseLombok()) {
            String setterGetter = makeSettersAndGetters(fieldName, variableDataType);
            fieldNameDeclaration.append("\n").append(setterGetter);
        }


        return fieldNameDeclaration.toString();
    }

    public String determineVariableType(String sqlDataType) {
        if (sqlDataType.equalsIgnoreCase("varchar") || sqlDataType.equalsIgnoreCase("text")) {
            return "String ";
        } else if (sqlDataType.equalsIgnoreCase("int") || sqlDataType.equalsIgnoreCase("serial")) {
            return "int ";
        } else if (sqlDataType.equalsIgnoreCase("bool")) {
            return "boolean ";
        } else {
            return "String ";
        }
    }

    public List<String> createVariableList(List<String> source, boolean isEntity) {
        List<String> vars = new ArrayList<>();
        for (String s : source) {
            vars.add(createVariables(s, isEntity));
        }
        return vars;
    }

    private String makeSettersAndGetters(String variableName, String varibaleType) {

        //create setter for each variable, take variable type and var name
        String setter = "public void set" + underscoreToCamelCase(variableName, true)
                + "( " + varibaleType + " " + underscoreToCamelCase(variableName, false) + " )" +
                "{\n" + "this." + underscoreToCamelCase(variableName, false) + " = "
                + underscoreToCamelCase(variableName, false) + ";\n}\n";

        //make getter
        String getter = "public " + varibaleType + " get" + underscoreToCamelCase(variableName, true)
                + "(){\nreturn " + underscoreToCamelCase(variableName, false) + ";\n}\n";

        return setter + "\n" + getter;
    }


    private String underscoreToCamelCase(String str, boolean capitalizeFirstLetter) {
        return CaseUtils.toCamelCase(str, capitalizeFirstLetter, '_');
    }


    public String getFilePath() {
        return filePath;
    }
}
