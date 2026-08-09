package Arrays.Medium;

public class stoneGameII{
    
    private static int[][] memo;
    private static int[] suffix;
    private static int n;

    public static void main(String[] args){
        int[] piles = {1, 2, 3, 4, 5, 100};

        int best = stoneGame(piles);

        System.out.print("The maximum number of Stones Alice can get: " + best);
    }
    

    public static int stoneGame(int[] piles) {

        n = piles.length;

        suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        memo = new int[n][n + 1];

        return dfs(0, 1);
    }

    private static int dfs(int i, int M) {

        if (i >= n)
            return 0;

        if (2 * M >= n - i)
            return suffix[i];

        if (memo[i][M] != 0)
            return memo[i][M];

        int best = 0;

        for (int X = 1; X <= 2 * M; X++) {

            best = Math.max(
                    best,
                    suffix[i] - dfs(i + X, Math.max(M, X))
            );
        }

        memo[i][M] = best;
        return best;
    }
}