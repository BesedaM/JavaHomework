package by.epam.learn.automation.additionaltask01.mainpart;

import by.epam.learn.automation.additionaltask01.logic.differentnumbersmin.DifferentNumbersMin;
import by.epam.learn.automation.additionaltask01.util.ConsolePrinter;

import static by.epam.learn.automation.additionaltask01.util.Text.NUMBER_DIFFERENT_NUMBERS_MIN;

public class DifferentNumbersMinMain {

    public static void findNumber(String[] array){
        String number = DifferentNumbersMin.findNumber(array);
        ConsolePrinter.printText(NUMBER_DIFFERENT_NUMBERS_MIN + number);
    }
}
