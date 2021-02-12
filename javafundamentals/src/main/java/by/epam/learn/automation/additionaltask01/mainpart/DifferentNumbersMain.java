package by.epam.learn.automation.additionaltask01.mainpart;

import by.epam.learn.automation.additionaltask01.util.Text;
import by.epam.learn.automation.additionaltask01.logic.differentnumbers.DifferentNumbers;
import by.epam.learn.automation.additionaltask01.util.ConsolePrinter;

public class DifferentNumbersMain {

    public static void findNumber(String[] numbers) {
        String numberWithDifferentNumbers = DifferentNumbers.findNumber(numbers);
        ConsolePrinter.printText(Text.NUMBER_DIFFERENT_NUMBERS + numberWithDifferentNumbers);
    }
}
