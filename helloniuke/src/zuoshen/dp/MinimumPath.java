package zuoshen.dp;

public class MinimumPath {
    public int getMin(int[][] map, int n, int m) {
        int dp[][] = new int[n][m];
        dp[0][0] = map[0][0];
        for(int i=1;i<n;i++){
            dp[i][0] = dp[i-1][0]+map[i][0];
        }
        for(int j =1;j<m;j++){
            dp[0][j] = dp[0][j-1]+map[0][j];
        }
        for(int i =1;i<n;i++){
            for(int j =1;j<m;j++){
                dp[i][j] = Math.min(dp[i-1][j]+map[i][j],dp[i][j-1]+map[i][j]);
            }
        }
        return dp[n-1][m-1];
    }
}
