package by.epam.learn.automation.optionaltask02.logic;

import java.util.Stack;

public class NumberStackCreator {

    /**
     * Creates integer stack of elements from integer number
     *
     * @param number input integer number
     * @return stack of integer elements
     */
    public static Stack<Integer> createIntegerStack(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 10);
            number /= 10;
        }
        return stack;
    }
}
