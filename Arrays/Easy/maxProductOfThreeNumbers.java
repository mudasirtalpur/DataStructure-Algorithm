package Arrays.Easy;

import java.util.Arrays;

public class maxProductOfThreeNumbers{
    public void main(String[] args){
        int[] nums = {-100,-98,-1,2,3,4};

        int maxProduct = maximumProduct(nums);

        System.out.print("The maximum product of three numbers is: " + maxProduct);
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(product(nums, 0, 3) > product(nums, nums.length-3, nums.length))
            if(product(nums, 0, 3) < product(nums, 0, 2) * nums[nums.length-1])
                return product(nums, 0, 2) * nums[nums.length-1];
            else
                product(nums, 0, 3);
        else
            if(product(nums, nums.length-3, nums.length) < product(nums, 0, 2) * nums[nums.length-1])
                return product(nums, 0, 2) * nums[nums.length-1];
        
        
        return product(nums, nums.length-3, nums.length);
    }

    public int product (int[] nums, int start, int end){
        int product = 1;
        while(start < end)
            product *= nums[start++];

        return product; 
    }
}