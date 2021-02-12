package by.epam.learn.automation.optionaltask01;

import by.epam.learn.automation.optionaltask01.logic.CustomReader;
import by.epam.learn.automation.optionaltask01.logic.CustomWriter;

import java.io.IOException;
import java.util.List;

/**
 * Reads lines from file to List. Writes lines of text in reversed order to OUTPUT_FILE
 */
public class Main {

    private static String INPUT_FILE_LOCATION = "javacollections/src/main/resources/poem.txt";
    private static String OUTPUT_FILE_LOCATION = "poem_out.txt";

    public static void main(String[] args) {
        try {
            List<String> text = CustomReader.readLinesFromFile(INPUT_FILE_LOCATION);
            CustomWriter.writeLinesToFileReversed(text,OUTPUT_FILE_LOCATION);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
