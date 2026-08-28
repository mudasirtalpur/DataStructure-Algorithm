package Arrays.Medium;

public class FindTheLargestAlmostMissingInteger{
    public static void main(String[] args){
        int[] nums = {3, 9, 2, 1, 7};
        int k = 3;

        System.out.print("The largest almost missing integer is: " + largestInteger(nums, k));
        //Meaning 3 and 7 only appear in only 1 subarray so they are almost missing
    }

    public static int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == n) {
            int max = nums[0];
            for (int x : nums) max = Math.max(max, x);
            return max;
        }

        int[] count = new int[51];
        for (int x : nums) 
            count[x]++;

        if (k == 1) {
            int ans = -1;
            for (int x : nums) if (count[x] == 1) ans = Math.max(ans, x);
            return ans;
        }

        int first = (count[nums[0]] == 1)     ? nums[0]     : -1;
        int last  = (count[nums[n - 1]] == 1) ? nums[n - 1] : -1;

        return Math.max(first, last);
    }
}