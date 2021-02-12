package by.epam.learn.automation.maintask04.logic;

public class StringNumberArrayTransformer {

    public static int[] getIntArray(String[] array) {
        int[] intArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArr[i] = getInt(array[i]);
        }
        return intArr;
    }

    private static int getInt(String string) {
        return Integer.decode(string);
    }
}
