package by.epam.learn.automation.optionaltask07.logic;

import java.util.*;

public class PropertiesStringData {

    /**
     * Puts all the properties values into list
     *
     * @param properties input properties file
     * @return list of string property values
     */
    public static List<String> getPropertiesListData(Properties properties) {
        List<String> propertiesData = new ArrayList<>();
        Set<String> propoertiesKeys = properties.stringPropertyNames();
        for (String key : propoertiesKeys) {
            propertiesData.add(properties.getProperty(key));
        }
        return propertiesData;
    }
}
