package didi.lianxuzuidahe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n =cin.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = cin.nextInt();
        }
        int max = nums[0];
        int dp[] = nums;
        for(int i=1;i<n;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            if(max<dp[i])
                max = dp[i];
        }

        System.out.println(max);
    }
}
