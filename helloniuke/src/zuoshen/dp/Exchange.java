package zuoshen.dp;

public class Exchange {
    public int countWays(int[] penny, int n, int aim) {
        int[][] dp = new int[n][aim + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < aim + 1;i++) {
            if(i%penny[0]==0){
                dp[0][i]=1;
            }else{
                dp[0][i]=0;
            }
        }
        for(int i =1;i<n;i++){
            for(int j=1;j<aim+1;j++){
                if(j<penny[i]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i][j-penny[i]]+dp[i-1][j];
                }
            }
        }
        return dp[n-1][aim];
    }
}
