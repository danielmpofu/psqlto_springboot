package pojo;

public class StartupConfig {
    private final String databaseName;
    private final boolean generateControllers;
    private final boolean generateModel;
    private final boolean useLombok;
    private final boolean generateConfigs;
    private final String projectPackage;

    private final String inputFile;
//    private boolean generateModel;

    public StartupConfig(String databaseName,
                         boolean generateControllers,
                         boolean generateModel,
                         boolean useLombok, boolean generateConfigs,
                         String projectPackage, String inputFile) {
        this.databaseName = databaseName;
        this.generateControllers = generateControllers;
        this.generateModel = generateModel;
        this.useLombok = useLombok;
        this.generateConfigs = generateConfigs;
        this.projectPackage = projectPackage;
        this.inputFile = inputFile;
    }

    public String getDatabaseName() {
        return databaseName;
    }

//    public void setDatabaseName(String databaseName) {
//        this.databaseName = databaseName;
//    }

    public boolean isGenerateControllers() {
        return generateControllers;
    }

//    public void setGenerateControllers(boolean generateControllers) {
//        this.generateControllers = generateControllers;
//    }

    public boolean isGenerateModel() {
        return generateModel;
    }

    public boolean isGenerateConfigs() {
        return generateConfigs;
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getProjectPackage() {
        return projectPackage;
    }

//    public void setGenerateModel(boolean generateModel) {
//        this.generateModel = generateModel;
//    }
}
