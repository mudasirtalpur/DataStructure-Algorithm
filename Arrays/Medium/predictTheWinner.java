package Arrays.Medium;

public class predictTheWinner{
    public void main(String[] args){
        int[] nums = {1,5,233,7};
        boolean isWinner = predictWinner(nums);

        System.out.print("Did the player 1 won the match: " + isWinner);
    }

    public boolean predictWinner(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = nums[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i] = Math.max(nums[i] - dp[i + 1], nums[j] - dp[i]);
            }
        }

        return dp[0] >= 0;
    }
}