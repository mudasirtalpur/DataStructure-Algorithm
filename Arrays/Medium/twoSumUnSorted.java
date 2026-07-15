package Arrays.Medium;

import java.util.*;

public class twoSumUnSorted{
    public void main(String[] args){
        int nums[] = {2,7,11,15};
        int target = 9;

        int[] result = sum(nums, target);

        for(int num : result)
            System.out.print(num + " ");
    }

    public int[] sum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            int needed = target - value;
            if(map.containsKey(needed))
                return new int[] {map.get(needed) , i};
            map.put(value, i);
        }

        return new int[] {-1, -1};
    }
}