package by.epam.learn.automation.optionaltask05ver1.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerListGenerator {

    private static Random generator = new Random();
    private static int MAX_INTEGER_NUMBER = 1000;

    public static List<Integer> generateRandomList(byte size) {
        if (size < 0) {
            size *= -1;
        }

        List<Integer> integerList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            integerList.add(generator.nextInt(MAX_INTEGER_NUMBER) * (generator.nextBoolean() ? 1 : -1));
        }
        return integerList;
    }
}
