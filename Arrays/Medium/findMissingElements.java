package Arrays.Medium;

import java.util.*;

public class findMissingElements{
    public void main(String[] args){
        int[] nums = {5, 1};

        System.out.println("Missing Elements in given array: " + missing(nums));

    }

    public List<Integer> missing(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min ) min = num;
            if(num > max) max = num;
        }

        int range = max - min + 1;
        boolean[] isPresent = new boolean[range];
        for(int num : nums)
            isPresent[num - min] = true;

        List<Integer> missing = new ArrayList<>();
        for(int i = 0; i < range; i++)
            if(!isPresent[i])
                missing.add(i + min);

        return missing;
    }
}