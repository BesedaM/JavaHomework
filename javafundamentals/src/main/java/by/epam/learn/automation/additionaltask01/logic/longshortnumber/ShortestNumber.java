package by.epam.learn.automation.additionaltask01.logic.longshortnumber;

public class ShortestNumber {

    public static String getNumber(String[] array) {
        String number = null;
        if (array.length > 0) {
            number = array[0];
            for (int i = 0; i < array.length; i++) {
                if (number.length() > array[i].length()) {
                    number = array[i];
                }
            }
        }
        return number;
    }
}
