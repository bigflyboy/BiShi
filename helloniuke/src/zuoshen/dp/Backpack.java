package zuoshen.dp;

public class Backpack {

    public int maxValue(int[] w, int[] v, int n, int cap) {
        int[][] dp = new int[n][cap+1];
        dp[0][0] = 0;
        for(int i=1;i<cap+1;i++){
            if(w[0]>i)
                dp[0][i] = 0;
            else
                dp[0][i] = v[0];
        }
        for(int i=1;i<n;i++){
            for(int j =1;j<cap+1;j++){
                if(w[i]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
                }
            }
        }
        return dp[n-1][cap];
    }
}
