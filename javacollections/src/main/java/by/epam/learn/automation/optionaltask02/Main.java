package by.epam.learn.automation.optionaltask02;

import by.epam.learn.automation.optionaltask02.logic.NumberStackCreator;
import by.epam.learn.automation.optionaltask02.logic.NumberStackRetriever;
import by.epam.learn.automation.optionaltask02.util.ConsolePrinter;
import by.epam.learn.automation.optionaltask02.util.ConsoleReader;

import java.util.Stack;

/**
 * User enters a number. Number's decimals being put to Stack. Result is a number with a reversed order decimals
 */
public class Main {

    public static void main(String[] args) {
        ConsolePrinter.printTextLine("Enter a number: ");
        int number = ConsoleReader.readInt();
        Stack<Integer> stack = NumberStackCreator.createIntegerStack(number);
        int reversedNumber = NumberStackRetriever.getReversedNumber(stack);
        ConsolePrinter.printTextLine("Reversed number: " + reversedNumber);

    }
}
