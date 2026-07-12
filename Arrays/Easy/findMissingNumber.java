package Arrays.Easy;

public class findMissingNumber{
    public void main(String[] args){
        int[] nums = {0, 2, 3, 1, 4};
        
        int missingNum = find(nums, nums.length);
        System.out.print("The Missing number in [0 , " + nums.length + "] is: " + missingNum + ".");

    }

    public int find(int[] nums, int n){
        int expectedSum = 0;
        int actualSum = 0;

        for(int i = 0; i <= n; i++)
            expectedSum += i;

        for(int num : nums)
            actualSum += num;

        return expectedSum - actualSum;
    }
}