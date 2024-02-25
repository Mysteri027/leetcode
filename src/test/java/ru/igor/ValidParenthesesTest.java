package ru.igor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void validParenthesesTest() {
        assertTrue(ValidParentheses.validParentheses("()"));
        assertTrue(ValidParentheses.validParentheses("()[]{}"));
        assertFalse(ValidParentheses.validParentheses("(]"));
    }
}