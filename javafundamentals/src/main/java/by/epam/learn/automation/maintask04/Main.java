package by.epam.learn.automation.maintask04;


import by.epam.learn.automation.maintask04.logic.ArraySum;
import by.epam.learn.automation.maintask04.logic.NumberValidator;
import by.epam.learn.automation.maintask04.logic.StringNumberArrayTransformer;
import by.epam.learn.automation.maintask04.util.ConsolePrinter;

import static by.epam.learn.automation.maintask04.util.Text.ARGUMENTS_SUM;
import static by.epam.learn.automation.maintask04.util.Text.INCORRECT_ARGUMENTS;

/**
 * Counts sum of command line arguments
 */
public class Main {

    public static void main(String[] args) {
        for (String arg : args) {
            if (!NumberValidator.isNumber(arg)) {
                ConsolePrinter.printText(INCORRECT_ARGUMENTS);
                return;
            }
        }

        ConsolePrinter.printText(ARGUMENTS_SUM);
        ConsolePrinter.printText(ArraySum.countSum(StringNumberArrayTransformer.getIntArray(args)) + "");
    }
}
