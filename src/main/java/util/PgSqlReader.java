package util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PgSqlReader {
    private final String filePath;
    private final String entityImports = "import java.util.Objects;\n" +
            "import javax.persistence.Entity;\n" +
            "import javax.persistence.GeneratedValue;\n" +
            "import javax.persistence.Id;\n";

    public PgSqlReader(String filePath) {
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
            if (isEntity) {
                classData.append(entityImports);
                classData.append("@Entity\n");
            }
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
        String vt = "";

        StringBuilder var = new StringBuilder();
        var.append("private ");

        if (fieldName.equalsIgnoreCase("id") && isEntity) {
            var.append("@Id " +
                    "@GeneratedValue " +
                    "@Column(name = \"").append(fieldName).append("\", nullable = false)");
        }

        if (fieldType.equalsIgnoreCase("varchar") || fieldType.equalsIgnoreCase("text")) {
            var.append("String ");
            vt = "String";
        } else if (fieldType.equalsIgnoreCase("int") || fieldType.equalsIgnoreCase("serial")) {
            var.append("int ");
            vt = "int";
        } else if (fieldType.equalsIgnoreCase("bool")) {
            var.append("boolean ");
            vt = "boolean";
        }

        var.append(underscoreToCamelCase(fieldName, false));
        var.append(";\n");

        String setterGetter = makeSettersAndGetters(fieldName, vt);
        var.append("\n").append(setterGetter);
        return var.toString();
    }

    private String makeSettersAndGetters(String vN, String vt) {

        String setter = "public void set" + underscoreToCamelCase(vN, true)
                + "( " + vt + " " + underscoreToCamelCase(vN, false) + " )" +
                "{\n" + "this." + underscoreToCamelCase(vN, false) + " = "
                + underscoreToCamelCase(vN, false) + ";\n}\n";

        String getter = "public " + vt + " get" + underscoreToCamelCase(vN, true)
                + "(){\nreturn " + underscoreToCamelCase(vN, false) + ";\n}\n";

        return setter + "\n" + getter;
    }


    private String underscoreToCamelCase(String str, boolean capitalizeFirstLetter) {
        return CaseUtils.toCamelCase(str, capitalizeFirstLetter, '_');
    }


    public String getFilePath() {
        return filePath;
    }
}
