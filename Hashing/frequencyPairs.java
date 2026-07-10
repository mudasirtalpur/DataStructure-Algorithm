package Hashing;

import java.util.*;

public class frequencyPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3};

        List<int[]> result = getFrequencyPairs(nums);

        for (int[] pair : result)
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
    }

    public static List<int[]> getFrequencyPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: build frequency map
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        // Step 2: convert map entries into List<int[]>
        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            result.add(new int[]{entry.getKey(), entry.getValue()});

        return result;
    }
}