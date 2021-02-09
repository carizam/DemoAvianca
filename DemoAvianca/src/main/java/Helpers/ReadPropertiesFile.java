package Helpers;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {

    private FileReader reader;
    private ReadPropertiesFile archivito;

    public ReadPropertiesFile() throws Exception{

        reader = new FileReader("C:\\Users\\carlosivan.ariza\\Downloads\\DemoAvianca\\src\\main\\resources\\config.properties");
        Properties prop = new Properties();
        prop.load(reader);

        String userdesde = prop.getProperty("Bogota");
        String userhacia = prop.getProperty("Miami");

    }
}