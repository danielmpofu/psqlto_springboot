import org.jetbrains.annotations.NotNull;
import pojo.StartupConfig;
import util.PgSqlReader;
import util.XmlParser;

public class Main {

    private static void init() {

    }

    public static void main(String[] args) {
        init();
//        PgSqlReader pgSqlReader;
        try {
            XmlParser xmlParser = new XmlParser();
            StartupConfig config = xmlParser.readConfig();
            PgSqlReader  pgSqlReader = new PgSqlReader(config.getInputFile());
            pgSqlReader.readFile();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }






    private  static void logConfig(@NotNull StartupConfig config){
        System.out.println("config db name: " + config.getDatabaseName());
        System.out.println("config do controllers: " + config.isGenerateControllers());
        System.out.println("config do models: " + config.isGenerateModel());
        System.out.println("config do configs: " + config.isGenerateConfigs());
        System.out.println("config input file path: " + config.getInputFile());
    }

}
