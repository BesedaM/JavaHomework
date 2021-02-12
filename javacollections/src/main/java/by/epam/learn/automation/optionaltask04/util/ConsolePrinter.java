package by.epam.learn.automation.optionaltask04.util;

import java.io.PrintStream;
import java.util.List;

/**
 * Prints text to console
 */
public class ConsolePrinter {

    private static PrintStream printer = System.out;

    public static void printList(List<String> stringList) {
        for (String line : stringList) {
            printer.println(line);
        }
    }

}
