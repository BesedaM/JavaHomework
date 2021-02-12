package by.epam.learn.automation.optionaltask07;

import by.epam.learn.automation.optionaltask07.logic.PropertiesReader;
import by.epam.learn.automation.optionaltask07.logic.PropertiesStringData;
import by.epam.learn.automation.optionaltask07.logic.StringAnalyser;
import by.epam.learn.automation.optionaltask07.util.ConsolePrinter;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * Checks whether the quotes in the lines are going in the right order
 */
public class Main {

    private static String FILE = "javacollections/src/main/resources/quotes data.properties";

    public static void main(String[] args) {
        try {
            Properties prop = PropertiesReader.getPropertiesFile(FILE);
            List<String> quotes = PropertiesStringData.getPropertiesListData(prop);

            for (String quote : quotes) {
                ConsolePrinter.printTextLine(quote);
                ConsolePrinter.printTextLine("Given quotes sequence is right: "
                        + StringAnalyser.analiseQuoteSequence(quote));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
