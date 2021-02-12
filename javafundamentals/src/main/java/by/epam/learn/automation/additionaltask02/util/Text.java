package by.epam.learn.automation.additionaltask02.util;

public interface Text {

    int MIN_NUMBERS_TO_ENTER = 3;
    int MAX_NUMBERS_TO_ENTER = 10;
    String HELLO_MESSAGE = "Enter a number from " + MIN_NUMBERS_TO_ENTER + " to " + MAX_NUMBERS_TO_ENTER + " : ";
    String ERROR = "Incorrect value...";
    int MAX_VALUE = 500;
    String SELECT_FIELD = "What field would you like to sort by?";
    String HINT = "Enter a number in a range from 1 till *:";
    String SORTED_MATRIX = "Sorted matrix:";
    String LONGEST_GROWING_SEQUENCE = "The longest growing sequence in the matrix:";
    String PROGRAM_CAN_DO = "What can the program do?";
    String SORTING_CHOICE = "\t1. Sort elements of the matrix by the growth of elements of the certain field";
    String GROWTH_SEQUENCE_CHOICE = "\t2. Display the longest sequence of growing elements one after another";
    String CHOICE_MESSAGE = "Enter the option number (1 or 2):";
}
