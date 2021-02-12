package by.epam.learn.automation.maintask01.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.learn.automation.maintask01.util.Text.NAME_VALIDATOR_SEQUENCE;

/*
Checks if the data user typed is a word
 */
public class WordValidator {

    private static String seq = NAME_VALIDATOR_SEQUENCE;
    private static Pattern pattern = Pattern.compile(seq);

    public static boolean isWord(String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
