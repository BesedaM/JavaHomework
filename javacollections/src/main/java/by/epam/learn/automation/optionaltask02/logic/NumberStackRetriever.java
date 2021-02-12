package by.epam.learn.automation.optionaltask02.logic;

import java.util.List;
import java.util.Stack;

/**
 * Class created to restore integer number from Integer stack
 */
public class NumberStackRetriever {

    /**
     * Restores number in the order of stack
     *
     * @param stack input integer stack
     * @return restored integer number
     */
    public static int restoreNumber(Stack<Integer> stack) {
        int number = 0;
        while (!stack.empty()) {
            number = number * 10 + stack.pop();
        }
        return number;
    }

    /**
     * Get reversed number from integer list elements
     *
     * @param list input integer list
     * @return restored reversed integer number
     */
    public static int getReversedNumber(Stack<Integer> list){
        int number = 0;
        for (Integer value : list) {
            number = number * 10 + value;
        }
        return number;
    }
}
