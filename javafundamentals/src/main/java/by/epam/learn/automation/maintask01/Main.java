package by.epam.learn.automation.maintask01;

import by.epam.learn.automation.maintask01.logic.WordValidator;
import by.epam.learn.automation.maintask01.util.ConsolePrinter;
import by.epam.learn.automation.maintask01.util.ConsoleReader;

import java.io.IOException;

import static by.epam.learn.automation.maintask01.util.Text.*;

/**
 * Says Hello to user, using his name
 */
public class Main {

    public static void main(String[] args) {
        String inputText = BLANK_FIELD;
        ConsolePrinter.printText(FIRST_QUESTION);
        try {
            while (inputText.length() < MINIMUM_WORD_SIZE) {
                inputText = ConsoleReader.readText();
                if (!WordValidator.isWord(inputText)) {
                    ConsolePrinter.printText(NOT_A_WORD);
                    inputText = BLANK_FIELD;
                }
            }
            ConsolePrinter.printText(HELLO + inputText);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
