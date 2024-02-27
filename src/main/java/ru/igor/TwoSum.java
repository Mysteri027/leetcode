package ru.igor;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] solve(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            int number = target - nums[i];
            if (map.containsKey(number)) {
                result[1] = i;
                result[0] = map.get(number);
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
