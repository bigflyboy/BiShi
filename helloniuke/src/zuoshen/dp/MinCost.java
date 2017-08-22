package zuoshen.dp;

public class MinCost {

    public int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int dp[][] = new int[n + 1][m + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = c1 * i;
        }
        for (int j = 1; j <= m; j++) {
            dp[0][j] = c0 * j;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1])
                    dp[i][j] = dp[i - 1][j - 1];
                else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + c1, dp[i][j - 1] + c0), dp[i - 1][j - 1] + c2);
                }
            }
        }
        return dp[n][m];
    }
}
