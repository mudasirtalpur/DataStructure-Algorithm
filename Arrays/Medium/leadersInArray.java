package Arrays.Medium;

import java.util.*;

public class leadersInArray{
    public void main(String[] args){
        int[] nums = {100, 4, 200, 1, 3, 2};
        ArrayList<Integer> leaders = new ArrayList<>();

        leaders = leaders(nums);

        System.out.print(leaders);
    }

    public ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = nums[nums.length-1];
        leaders.add(max);
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < max)
                continue;
            max = nums[i];
            leaders.add(max);
        }

        Collections.reverse(leaders);
        return leaders;
    }
}