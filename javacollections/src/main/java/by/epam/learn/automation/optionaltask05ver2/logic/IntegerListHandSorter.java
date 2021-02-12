package by.epam.learn.automation.optionaltask05ver2.logic;

import java.util.List;

public class IntegerListHandSorter {

    /**
     * Moves negative elements to end of the list, positive to the beginning
     *
     * @param integers input List of integer values
     */
    public static void sort(List<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < 0) {
                for (int j = integers.size() - 1; j > i; j--) {
                    if (integers.get(j) > 0) {
                        Integer temporaryNumber = integers.get(i);
                        integers.set(i, integers.get(j));
                        integers.set(j, temporaryNumber);
                    }

                }
            }

        }
    }
}
