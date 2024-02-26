package ru.igor;

import java.util.Stack;

// 20
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
public class ValidParentheses {
    public static boolean validParentheses(String s) {
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
