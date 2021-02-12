package by.epam.learn.automation.additionaltask01.logic.sortbylength;

public class Sorting {

    public static void sortByLength(String[] array) {

        if (array != null && array.length > 1) {

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++)
                    if (array[j].length() > array[j + 1].length()) {
                        String transientElem = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = transientElem;
                    }
            }
        }
    }

}
