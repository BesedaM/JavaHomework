package by.epam.learn.automation.optionaltask01.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CustomWriter {

    /**
     * Writes strings of text to file from list in reversed order
     *
     * @param data input string array
     * @param fileName file name to write the data
     * @throws IOException
     */
    public static void writeLinesToFileReversed(List<String> data, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (int i = data.size() - 1; i >= 0; i--) {
            writer.write(data.get(i) + System.lineSeparator());
            writer.flush();
        }


    }
}
