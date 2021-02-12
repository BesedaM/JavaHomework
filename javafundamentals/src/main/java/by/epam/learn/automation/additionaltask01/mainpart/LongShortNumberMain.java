package by.epam.learn.automation.additionaltask01.mainpart;

import by.epam.learn.automation.additionaltask01.logic.longshortnumber.LongestNumber;
import by.epam.learn.automation.additionaltask01.logic.longshortnumber.ShortestNumber;
import by.epam.learn.automation.additionaltask01.util.ConsolePrinter;

import static by.epam.learn.automation.additionaltask01.util.Text.*;
import static by.epam.learn.automation.additionaltask01.util.Text.THE_LENGTH;

public class LongShortNumberMain {

    public static void findNumbers(String[] numbers){
        String longestNumber = LongestNumber.getNumber(numbers);
        String shortestNumber = ShortestNumber.getNumber(numbers);

        ConsolePrinter.printText(THE_LONGEST_NUMBER + longestNumber + THE_LENGTH + longestNumber.length()
                + System.lineSeparator());
        ConsolePrinter.printText(THE_SHORTEST_NUMBER + shortestNumber + THE_LENGTH + shortestNumber.length());
    }
}
