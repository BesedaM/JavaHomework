package by.epam.learn.automation.optionaltask04.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomReader {

    /**
     * Reads data from text file line by line to {@link List<String>}
     *
     * @param fileName file to read
     * @return  list of strings
     * @throws IOException
     */
    public static List<String> readLinesFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> fileData = new ArrayList<>();
        String textLine;
        while ((textLine = reader.readLine()) != null) {
            fileData.add(textLine);
        }
        return fileData;
    }
}
