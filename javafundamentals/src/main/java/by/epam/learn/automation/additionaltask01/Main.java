package by.epam.learn.automation.additionaltask01;

import by.epam.learn.automation.additionaltask01.mainpart.*;
import by.epam.learn.automation.additionaltask01.util.ConsolePrinter;
import by.epam.learn.automation.additionaltask01.util.ConsoleReader;
import by.epam.learn.automation.additionaltask01.util.Text;

import java.io.IOException;

/**
 * Processing of given numbers
 */
public class Main {

    public static void main(String[] args) {

        String[] numbers = new String[Text.NUMBERS_TO_ENTER];

        ConsolePrinter.printText(Text.HELLO_MESSAGE + System.lineSeparator());
        try {
            for (int i = 0; i < Text.NUMBERS_TO_ENTER; i++) {
                ConsolePrinter.printText(Text.ENTER_NUMBER);
                String value = ConsoleReader.readText();
                if (NumberValidator.isNumber(value)) {
                    numbers[i] = value;
                } else {
                    ConsolePrinter.printText(Text.MISTAKE);
                    i--;
                }
            }

            ConsolePrinter.printText(System.lineSeparator() + Text.YOU_CAN_SEE + System.lineSeparator());
            ConsolePrinter.printText(Text.CHOICE_LONGEST_SHORTEST_NUMBERS + System.lineSeparator());
            ConsolePrinter.printText(Text.CHOICE_SORTED_NUMBERS + System.lineSeparator());
            ConsolePrinter.printText(Text.CHOICE_NUMBER_DIFFERENT_NUMBERS + System.lineSeparator());
            ConsolePrinter.printText(Text.CHOICE_NUMBER_MIN_DIFFERENT_NUMBERS + System.lineSeparator());
            ConsolePrinter.printText(System.lineSeparator() + Text.CHOICE_MESSAGE);


            String choice = ConsoleReader.readText();
                switch (choice){
                    case "1":
                        LongShortNumberMain.findNumbers(numbers);
                        break;
                    case "2":
                        SortingMain.sortNumbers(numbers);
                        break;
                    case "3":
                        DifferentNumbersMain.findNumber(numbers);
                        break;
                    case "4":
                        DifferentNumbersMinMain.findNumber(numbers);
                        break;
                    default:
                        ConsolePrinter.printText(Text.MISTAKE);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
