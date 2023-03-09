package pojo;

import lombok.Data;
@Data
public class StartupConfig {
    private final String databaseName;
    private final boolean generateControllers;
    private final boolean generateModel;
    private final boolean useLombok;
    private final boolean generateConfigs;
    private final String projectPackage;
    private final String inputFile;

}
