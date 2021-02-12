package by.epam.learn.automation.additionaltask01.mainpart;

import by.epam.learn.automation.additionaltask01.logic.sortbylength.Sorting;
import by.epam.learn.automation.additionaltask01.util.ConsolePrinter;

public class SortingMain {

    public static void sortNumbers(String[] numbers) {
        Sorting.sortByLength(numbers);
        for (String val : numbers) {
            ConsolePrinter.printText(val + System.lineSeparator());
        }
    }
}
