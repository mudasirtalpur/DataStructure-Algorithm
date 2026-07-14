// package Arrays.Easy;

import java.util.*;

public class largestSubArrayToSumK{
    public void main(String[] args){
        int[] nums = {10, 5, 2, 7, 1, -10};
        int k = 15;

        System.out.print("The length of longest SubArray with sum: " + k + " is of: " + largestSubArray(nums, k));
    }

    public int largestSubArray(int[] nums, int k) {
    Map<Integer, Integer> firstIndex = new HashMap<>();
    firstIndex.put(0, -1);
    int sum = 0, maxLen = 0;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if (firstIndex.containsKey(sum - k)) {
            maxLen = Math.max(maxLen, i - firstIndex.get(sum - k));
        }
        firstIndex.putIfAbsent(sum, i);
    }

    return maxLen;
}
}
