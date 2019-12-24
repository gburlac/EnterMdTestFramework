package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    String browser;

    static PropertiesReader propertiesReader;

    private PropertiesReader() {
        initProperties();
    }

    private void initProperties() {
        Properties prop = new Properties();
        String path = "src/test/properties/env.properties";
        try {
            InputStream istream = new FileInputStream(path);
            prop.load(istream);
            browser = prop.getProperty("browser");
        } catch (FileNotFoundException e) {
            System.out.println("PROPRETIES FILE IS NOT FOUND");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static PropertiesReader getInstatnce() {
        if (propertiesReader == null) {
            propertiesReader = new PropertiesReader();
        }
        return propertiesReader;
    }

    public String getBrowser() {
        return browser;
    }
}
