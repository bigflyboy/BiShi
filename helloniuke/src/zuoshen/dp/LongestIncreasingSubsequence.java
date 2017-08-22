package zuoshen.dp;

public class LongestIncreasingSubsequence {
    public int getLIS(int[] A, int n) {
        int[] dp = new int[n];
        for(int i =0;i<n;i++){
            dp[i] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(A[i]>A[j]&&dp[i]<(dp[j]+1)){
                    dp[i] = dp[j]+1;
                }
            }
        }
        int a = 0;
        for(int j =0;j<n;j++){
            if(a<dp[j])
                a = dp[j];
        }
        return a;
    }
}
