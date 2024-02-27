package ru.igor;

import java.util.Stack;

public class ValidParentheses {
    public static boolean solve(String s) {
        var charStack = new Stack<Character>();
        var charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '(') {
                charStack.push(')');
            } else if (c == '{') {
                charStack.push('}');
            } else if (c == '[') {
                charStack.push(']');
            } else {
                if (charStack.isEmpty() || charStack.pop() != c) {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}
