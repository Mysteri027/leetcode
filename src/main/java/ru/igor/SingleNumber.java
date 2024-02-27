package ru.igor;

public class SingleNumber {
    public static int solve(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }
}
