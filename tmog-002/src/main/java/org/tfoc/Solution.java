package org.tfoc;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    private static final int NONE = 0;
    private static final int PARENTHESES = 1;
    private static final int BRACKET = 2;
    private static final int SQUARE = 3;

    public static boolean isValid(String s) {
        Deque<Integer> parenthesesStack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (isOpeningParentheses(c)) parenthesesStack.push(getParenthesesType(c));
            else if (isClosingParentheses(c) && (parenthesesStack.isEmpty() || getParenthesesType(c) != parenthesesStack.pop())) return false;
        }

        return parenthesesStack.isEmpty();
    }

    private static boolean isOpeningParentheses(char c) {
        return '(' == c || '{' == c || '[' == c;
    }

    private static boolean isClosingParentheses(char c) {
        return ')' == c || '}' == c || ']' == c;
    }

    private static int getParenthesesType(char c) {
        return switch (c) {
            case '(', ')' -> PARENTHESES;
            case '{', '}' -> BRACKET;
            case '[', ']' -> SQUARE;
            default -> NONE;
        };
    }

}
