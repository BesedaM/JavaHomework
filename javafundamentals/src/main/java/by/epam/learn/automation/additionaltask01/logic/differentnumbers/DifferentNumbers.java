package by.epam.learn.automation.additionaltask01.logic.differentnumbers;

public class DifferentNumbers {

    public static String findNumber(String[] array) {
        String value = null;
        if (array != null && array.length > 0) {
            for (String number : array) {
                if (hasDifferentNumbers(number)) {
                    value = number;
                    break;
                }
            }
        }
        return value;
    }

    public static boolean hasDifferentNumbers(String number) {
        boolean diffNumbers = true;
        for (int i = 0; i < number.length() - 1; i++) {
            for (int j = i + 1; j < number.length(); j++) {
                if (number.charAt(i) == number.charAt(j)) {
                    diffNumbers = false;
                    break;
                }
            }
        }
        return diffNumbers;
    }

}
