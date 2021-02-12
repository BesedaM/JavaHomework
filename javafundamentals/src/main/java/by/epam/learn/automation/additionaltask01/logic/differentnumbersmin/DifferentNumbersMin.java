package by.epam.learn.automation.additionaltask01.logic.differentnumbersmin;

public class DifferentNumbersMin {

    public static String findNumber(String[] array) {
        String value = null;
        if (array != null && array.length > 0) {

            value = array[0];
            int numberOfDifferentNumbers = countDifferentNumbers(array[0]);

            for (int i = 1; i < array.length; i++) {
                int num = countDifferentNumbers(array[i]);
                if (num < numberOfDifferentNumbers) {
                    numberOfDifferentNumbers = num;
                    value = array[i];
                }
            }
        }
        return value;
    }

    private static int countDifferentNumbers(String number) {
        int diffNumbers = 0;
        for (int i = 0; i < number.length(); i++) {
            boolean hasNumber = false;
            diffNumbers++;
            for (int j = i + 1; j < number.length(); j++) {
                if (number.charAt(i) == number.charAt(j)) {
                    hasNumber = true;
                }
            }
            if (hasNumber) {
                diffNumbers--;
            }
        }
        return diffNumbers;
    }

}
