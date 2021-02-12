package by.epam.learn.automation.additionaltask01.mainpart;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.learn.automation.additionaltask01.util.Text.NUMBER_REGEXP;

public class NumberValidator {

    private static Pattern pattern = Pattern.compile(NUMBER_REGEXP);

    public static boolean isNumber(String text) {
        Matcher m = pattern.matcher(text);
        return m.matches();
    }
}
