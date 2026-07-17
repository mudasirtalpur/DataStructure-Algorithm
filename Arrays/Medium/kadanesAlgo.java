package Arrays.Medium;

public class kadanesAlgo{
    public void main(String[] args){
        int[] nums = {-1};

        System.out.print(maxSubArray(nums));

    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0)
                sum = 0;

        }

        return maxSum;
    }
}