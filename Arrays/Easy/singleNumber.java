package Arrays.Easy;

// import java.util.*;

public class singleNumber{
    public void main(String[] args){
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        int singleNum = find(nums);
        System.out.print("The element present only once is: " + singleNum);
    }

    public int find(int[] nums){
        // Map<Integer, Integer> mapping = new HashMap<>();
        // for(int i = 0; i < nums.length; i++)
        //     mapping.put(nums[i], mapping.getOrDefault(nums[i] , 0) + 1);
        // int single = 0;
        // for(int num : mapping.keySet())
        //     if(mapping.get(num) == 1)
        //         single =  num;
    
        // return single;


        int operation = 0;
        for(int num : nums)
            operation = operation ^ num;

        return operation;
    }
}