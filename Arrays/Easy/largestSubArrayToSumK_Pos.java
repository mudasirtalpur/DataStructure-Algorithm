package Arrays.Easy;
// import java.util.*;

public class largestSubArrayToSumK_Pos{
    public void main(String[] args){
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.print("The largest SubArray for Sum to: " + k + " is of length: " + largestSubArray(nums, k));
    }

    public int largestSubArray(int[] nums, int k){
        // Map<Integer, Integer> mapping = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     int sum = nums[i];
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum == k)
        //             mapping.put(i, j);
        //         else if(sum > k)
        //             break;
        //     }
        // }
        // int max = 0;
        // for(int i = 0; i < nums.length; i++)
        //     if(max < mapping.getOrDefault(i, 0))
        //         max = mapping.get(i);

        // return max;
        int sum = 0;
        int maxLen = 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            if(sum > k){
                sum -= nums[i];
                i++;
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }
}