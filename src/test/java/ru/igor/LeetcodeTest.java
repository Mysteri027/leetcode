package ru.igor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetcodeTest {

    @Test
    public void singleNumberTest() {
        assertEquals(1, SingleNumber.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, SingleNumber.singleNumber(new int[]{1}));
    }

    @Test
    public void validParenthesesTest() {
        assertTrue(ValidParentheses.validParentheses("()"));
        assertTrue(ValidParentheses.validParentheses("()[]{}"));
        assertFalse(ValidParentheses.validParentheses("(]"));
    }

    @Test
    public void twoSumTest() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, TwoSum.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3, 3}, 6));
    }
}