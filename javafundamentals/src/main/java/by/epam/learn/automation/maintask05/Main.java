package by.epam.learn.automation.maintask05;

import by.epam.learn.automation.maintask05.monthname.MonthNameSelector;
import by.epam.learn.automation.maintask05.monthname.NumberValidator;
import by.epam.learn.automation.maintask05.monthname.Text;
import by.epam.learn.automation.maintask05.util.ConsolePrinter;
import by.epam.learn.automation.maintask05.util.ConsoleReader;

import java.io.IOException;

/**
 * Display month's name according to users input
 */
public class Main {

    public static void main(String[] args) {
        boolean incorrectInput = true;
        ConsolePrinter.printText(Text.ENTER_NUMBER);
        try {
            while (incorrectInput) {
                String input = ConsoleReader.readText();
                if (NumberValidator.isNumber(input)
                        && NumberValidator.isNumberInMonthRange(input)) {
                    int number = Integer.decode(input);
                    String monthName = MonthNameSelector.getMonthName(number);
                    ConsolePrinter.printText(monthName);
                    incorrectInput = false;
                } else {
                    ConsolePrinter.printText(Text.INCORRECT_INPUT);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
