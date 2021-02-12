package by.epam.learn.automation.maintask02;

import by.epam.learn.automation.maintask02.util.Text;
import by.epam.learn.automation.maintask02.util.ConsolePrinter;

/**
 * Displays command line arguments in reversed order
 */
public class Main {

    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            ConsolePrinter.printText(args[i] + Text.SPACE);
        }
    }
}
