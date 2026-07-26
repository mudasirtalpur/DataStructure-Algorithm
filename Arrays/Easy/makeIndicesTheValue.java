package Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class makeIndicesTheValue{
    public static void main(String[] args){
        int[] nums = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        System.out.println("Before modifying: ");
        for(int num : nums)
            System.out.print(num + " ");

        modifyArray(nums);

        System.out.println("\nAfter modifying: ");
        for(int num : nums)
            System.out.print(num + " ");

    }

    public static void modifyArray(int[] nums) {
        // code here
        Set<Integer> list = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            list.add(nums[i]);
        
        for(int i = 0; i < nums.length; i++){
            if(list.contains(i))
                nums[i] = i;
            else
                nums[i] = -1;
        }
    }
}