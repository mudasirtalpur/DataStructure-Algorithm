package Arrays.Medium;

import java.util.*;

public class longestConsucativeSequence{
    public void main(String[] args){
        int[] nums = {100, 4, 200, 1, 3, 2};

        int longestConsucatives = longestConsucative(nums);

        System.out.print("The longest consucative sequence in array is: " + longestConsucatives);
    }

    public int longestConsucative(int[] nums){
        if(nums.length == 0)
            return 0;
        int longest = 1;

        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int x = it;

                while(set.contains(x + 1)){
                    x++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}