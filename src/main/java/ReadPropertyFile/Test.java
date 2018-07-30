package main.java.ReadPropertyFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Test {

    public static void main(String[] args) throws IOException {

        Test test = new Test();
        String location = "../../resource/menu.properties";

        Properties properties = test.getProperties(location);
        System.out.println(properties.getProperty("MENU_10_ID"));

        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + " : " + properties.getProperty(key));
        }
    }

    public Properties getProperties(String location) throws IOException {

        InputStream inputStream = this.getClass().getResourceAsStream(location);
        Properties properties = new Properties();
        properties.load(inputStream);

        return properties;
    }
}
