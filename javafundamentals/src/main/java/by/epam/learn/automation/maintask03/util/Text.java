package by.epam.learn.automation.maintask03.util;

public interface Text {

    String SPACE = " ";
    String LINE_SEPARATOR = System.lineSeparator();
    int MINIMUM_NUMBER_OF_NUMBERS = 2;
    int MAXIMUM_NUMBER_OF_NUMBERS = 10;
    String FIRST_MESSAGE = "How many numbers do you want to get? (enter number from " + MINIMUM_NUMBER_OF_NUMBERS
            + " to " + MAXIMUM_NUMBER_OF_NUMBERS + "): ";
    String ERROR = "INCORRECT INPUT" + LINE_SEPARATOR + "Repeat your input: "+System.lineSeparator();
    String INLINE_RESULT = "INLINE RESULT: ";
    String DIFFERENT_LINES = "DIFFERENT LINES:";


}
