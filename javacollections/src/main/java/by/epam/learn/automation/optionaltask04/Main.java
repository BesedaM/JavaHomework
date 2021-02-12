package by.epam.learn.automation.optionaltask04;

import by.epam.learn.automation.optionaltask04.logic.CustomReader;
import by.epam.learn.automation.optionaltask04.logic.StringLengthComparator;
import by.epam.learn.automation.optionaltask04.util.ConsolePrinter;

import java.io.IOException;
import java.util.List;

/**
 * Puts a poem into a list. Sorts lines of poem according to their length
 */
public class Main {

    private static String FILE="javacollections/src/main/resources/poem with different lines.txt";

    public static void main(String[] args) {
        try {
            List<String> stringList = CustomReader.readLinesFromFile(FILE);
            stringList.sort(new StringLengthComparator());
            ConsolePrinter.printList(stringList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
