package by.epam.learn.automation.optionaltask07.util;

import java.io.PrintStream;
import java.util.List;

/**
 * Prints text to console
 */
public class ConsolePrinter {

    private static PrintStream printer = System.out;

    public static void printTextLine(String text) {
        printer.println(text);
    }

}
