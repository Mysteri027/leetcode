package ru.igor;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int solve(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;
        int result = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }
}
