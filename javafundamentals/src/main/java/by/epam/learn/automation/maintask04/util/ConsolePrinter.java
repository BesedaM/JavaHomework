package by.epam.learn.automation.maintask04.util;

import java.io.PrintStream;

/**
 * Prints text to console
 */
public class ConsolePrinter {

    private static PrintStream printer = System.out;

    public static void printText(String text) {
        printer.print(text);
    }

}
