package by.epam.learn.automation.optionaltask05ver2;

import by.epam.learn.automation.optionaltask05ver1.util.ConsolePrinter;
import by.epam.learn.automation.optionaltask05ver1.util.IntegerListGenerator;
import by.epam.learn.automation.optionaltask05ver2.logic.IntegerListHandSorter;

import java.util.List;

/**
 * Puts positive list elements at the beginning, negative - at the end of the list.
 * Task done without any auxiliary objects (hand sorting)
 */
public class Main {

    private static byte LIST_SIZE = 15;

    public static void main(String[] args) {

        List<Integer> integerList = IntegerListGenerator.generateRandomList(LIST_SIZE);
        ConsolePrinter.printTextLine("Integer array before sorting: ");
        ConsolePrinter.printList(integerList);
        IntegerListHandSorter.sort(integerList);
        ConsolePrinter.printTextLine("Integer array after sorting: ");
        ConsolePrinter.printList(integerList);
    }
}
