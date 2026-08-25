package Arrays.Easy;

import java.util.*;

public class missingMultipleOfK{
    public static void main(String[] args){
        int[] nums = {8,2,3,4,6};
        int k = 2;

        System.out.print("The smallest missing multiple of " + k + " is: " + missingMultiple(nums, k));
    }

    public static int missingMultiple(int[] nums, int k){
        HashSet<Integer> hash = new HashSet<>();
        for(int num : nums)
            hash.add(num);

        int missing = 0;
        for(int i = 1; i <= 101; i++){
            if(!hash.contains(i * k)){
                missing = i * k;
                break;
            }
        }

        return missing;
    }
}