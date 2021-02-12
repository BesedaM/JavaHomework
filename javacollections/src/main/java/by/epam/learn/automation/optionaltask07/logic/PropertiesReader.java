package by.epam.learn.automation.optionaltask07.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    /**
     * Reads properties from properties file
     *
     * @param fileName input file name
     * @return properties object
     * @throws IOException
     */
    public static Properties getPropertiesFile(String fileName) throws IOException {
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader(fileName)));
        return properties;
    }
}
