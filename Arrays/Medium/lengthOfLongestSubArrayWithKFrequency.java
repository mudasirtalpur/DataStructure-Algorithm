package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubArrayWithKFrequency{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;

        int length = maxSubarrayLength(nums, k); 

        System.out.println("The length of longest Sub Array with " + k + " Frequency is: " + length);
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            freq.merge(nums[right], 1, Integer::sum);

            while (freq.get(nums[right]) > k) {
                int leftVal = nums[left];
                freq.put(leftVal, freq.get(leftVal) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}