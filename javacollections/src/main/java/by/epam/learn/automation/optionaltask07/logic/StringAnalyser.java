package by.epam.learn.automation.optionaltask07.logic;

import java.util.Stack;

public class StringAnalyser {

    /**
     * Analise the input quotes sequence
     *
     * @param quotesSequence quotes sequence
     * @return true if given the right sequence
     */
    public static boolean analiseQuoteSequence(String quotesSequence) {
        Stack<Character> stack = new Stack<>();
        stack.push(quotesSequence.charAt(0));

        for (int i = 1; i < quotesSequence.length(); i++) {
            char currentChar = quotesSequence.charAt(i);
            if (!stack.empty()) {
                Character stackCharacter = stack.peek();
                if (stackCharacter == '(' && currentChar == ')'
                        || stackCharacter == '{' && currentChar == '}'
                        || stackCharacter == '[' && currentChar == ']') {
                    stack.pop();
                }else{
                    stack.add(currentChar);
                }
            } else {
                stack.add(currentChar);
            }
        }
        return stack.empty();
    }
}
