package ru.igor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetcodeTest {

    @Test
    public void singleNumberTest() {
        assertEquals(1, SingleNumber.solve(new int[]{2, 2, 1}));
        assertEquals(4, SingleNumber.solve(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, SingleNumber.solve(new int[]{1}));
    }

    @Test
    public void validParenthesesTest() {
        assertTrue(ValidParentheses.solve("()"));
        assertTrue(ValidParentheses.solve("()[]{}"));
        assertFalse(ValidParentheses.solve("(]"));
    }

    @Test
    public void twoSumTest() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.solve(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, TwoSum.solve(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, TwoSum.solve(new int[]{3, 3}, 6));
    }

    @Test
    public void removeElementTest() {
        assertEquals(2, RemoveElement.solve(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, RemoveElement.solve(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    public void majorityElementTest() {
        assertEquals(3, MajorityElement.solve(new int[]{3, 2, 3}));
        assertEquals(2, MajorityElement.solve(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    public void validPalindrome() {
        assertTrue(ValidPalindrome.solve("A man, a plan, a canal: Panama"));
        assertFalse(ValidPalindrome.solve("race a car"));
        assertTrue(ValidPalindrome.solve(" "));
    }

    @Test
    public void missingNumber() {
        assertEquals(2, MissingNumber.solve(new int[] {3,0,1}));
        assertEquals(2, MissingNumber.solve(new int[] {0,1}));
        assertEquals(8, MissingNumber.solve(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}