package Arrays.Easy;

import java.util.Arrays;

// Given the array of integers nums, 
// you will choose two different indices i and j of that array. 
// Return the maximum value of (nums[i]-1)*(nums[j]-1)
public class maxProductOfTwoElements{
    public void main(String[] args){
        int[] nums = {3,4,5,2};
        int maxProduct = maxProduct(nums);
        System.out.print("The max product of two elements is: " + maxProduct);
    }

    public int maxProduct(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length-1]) * (nums[nums.length-2]-1);
    }
}