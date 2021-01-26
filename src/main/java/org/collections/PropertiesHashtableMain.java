package org.collections;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesHashtableMain {
    // read properties file
    // key - value
    public static void main(String[] args) throws IOException {

        // src/main/resources/configuration/database.properties
        String classPathProperties = "configuration/database.properties";

        InputStream is = PropertiesHashtableMain.class.getClassLoader().getResourceAsStream(classPathProperties);

        System.out.println(is);

        Properties properties = new Properties();
        properties.load(is);

        System.out.println(properties);

        System.out.println(properties.getProperty("username"));

        Set<String> propertyNames = properties.stringPropertyNames();
        for(String key: propertyNames)
        {
            System.out.println(key+" "+properties.getProperty(key));
        }
    }
}
