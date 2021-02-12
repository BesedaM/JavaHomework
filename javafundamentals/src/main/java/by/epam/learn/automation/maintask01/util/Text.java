package by.epam.learn.automation.maintask01.util;

public interface Text {

    String BLANK_FIELD = "";
    String NAME_VALIDATOR_SEQUENCE ="[a-zA-Z-]+";
    String FIRST_QUESTION = "Please, enter your name: ";
    String NOT_A_WORD = System.lineSeparator() +" Incorrect input." + System.lineSeparator() + "Please, type in a word: ";
    int MINIMUM_WORD_SIZE = 2;
    String HELLO = "Hello, ";
}
