package zuoshen.dp;

public class LCS {
    public int findLCS(String A, int n, String B, int m) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int dp[][] = new int[n][m];
        if(a[0]==b[0])
            dp[0][0] = 1;
        for(int i=1;i<n;i++){
            if(a[i]==b[0]){
                dp[i][0] = 1;
            }else{
                dp[i][0] = dp[i-1][0];
            }
        }
        for(int j =1;j<m;j++){
            if(a[0]==b[j]){
                dp[0][j] = 1;
            }else{
                dp[0][j] = dp[0][j-1];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(a[i]==b[j]){
                    dp[i][j] = dp[i-1][j-1]+1;
                } else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1];
    }
}
