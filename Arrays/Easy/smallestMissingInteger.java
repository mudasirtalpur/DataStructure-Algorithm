//Question: Smallest Missing Integer Greater Than Sequencial Prefix Sum

package Arrays.Easy;

import java.util.*;

public class smallestMissingInteger{
    public static void main(String[] args){
        int[] nums = {3, 4, 5, 1, 12, 14, 13};

        int missing = missingInteger(nums);
        System.out.print("The Missing Integer: " + missing);
    }

    public static int missingInteger(int[] nums) {
        int n = nums.length;
        
        int i = 0;
        while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
            i++;
        }
        
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += nums[j];
        }
        
        Set<Integer> present = new HashSet<>();
        for (int num : nums) {
            present.add(num);
        }
        
        while (present.contains(sum)) {
            sum++;
        }
        
        return sum;
    }
}