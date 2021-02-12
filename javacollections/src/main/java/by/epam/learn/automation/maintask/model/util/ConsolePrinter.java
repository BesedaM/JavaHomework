package by.epam.learn.automation.maintask.model.util;

import java.io.PrintStream;

/**
 * Prints text to console
 */
public class ConsolePrinter {

    private static PrintStream printer = System.out;

    public static void printTextLine(String text) {
        printer.print(text + System.lineSeparator());
    }

}
