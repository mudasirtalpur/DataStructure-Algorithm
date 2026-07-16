package Arrays.Medium;

import java.util.*;

public class majorityElement_I{
    public void main(String[] args){
        int[] nums = {1, 7, 2, 7, 7};

        System.out.print("The majority element of (> n/2) in Array is: " + majorityElement(nums));
    }

    public int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0)+1);

        int majorityIndex = 0;
        for(int i = 1; i < nums.length; i++)
            if(map.get(nums[majorityIndex]) < map.get(nums[i]))
                majorityIndex = i;

        if(map.get(nums[majorityIndex]) > nums.length/2)//This condition if not certain that
            return nums[majorityIndex]; // majority element of (greater than n/2) exists or not
        
        return -1;
    }
}