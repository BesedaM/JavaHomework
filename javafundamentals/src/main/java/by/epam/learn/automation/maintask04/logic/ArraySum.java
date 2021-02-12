package by.epam.learn.automation.maintask04.logic;

public class ArraySum {

    public static int countSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
