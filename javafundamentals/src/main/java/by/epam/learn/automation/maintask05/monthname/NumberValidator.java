package by.epam.learn.automation.maintask05.monthname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {

    private static Pattern pattern = Pattern.compile(Text.NUMBER_REGEXP);

    public static boolean isNumber(String text) {
        Matcher m = pattern.matcher(text);
        return m.matches();
    }

    public static boolean isNumberInMonthRange(String text) {
        boolean monthExists = false;
        if (isNumber(text)) {
            int number = Integer.decode(text);
            if (number >= Text.MIN_MONTH && number <= Text.MAX_MONTH) {
                monthExists = true;
            }
        }
        return monthExists;
    }
}
