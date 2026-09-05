package Arrays.Easy;

import java.util.*;

public class smallestStableIndexI{
    public static void main(String[] args){
        int[] nums = {5,0,1,4};

        System.out.print(stableIndex(nums, 3));

    }

    public static int stableIndex(int[] nums, int k){
        int n = nums.length;
        List<Integer> stb = new LinkedList<>();
        stb.add(nums[0]);

        for(int i = 1; i < n; i++)
            stb.add(Math.max(nums[i], stb.get(i - 1)));

        int min = Integer.MAX_VALUE;
        for(int i = n-1; i >= 0; i--){
            min = Math.min(min, nums[i]);
            stb.set(i, stb.get(i) - min);
        }

        for(int i = 0; i < n; i++)
            if(stb.get(i) <= k)
                return i;
        
        return -1;
    }
}