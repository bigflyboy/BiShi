package lianjiabishi.bukao.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int k = cin.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            nums[i] = cin.nextInt();
        }
        int[][] f = new int[n + 1][m + 1];
        for(int i=1;i<n+1;i++){
            f[i][1] = nums[i];
        }
        for(int i =k;i<n+1;i++){
            for(int j=2;j<m+1;j++){
                f[i][j] = Math.max(f[i][j],f[i-1][j]);
                if(i>=k){
                    f[i][j] = Math.max(f[i][j],f[i-k][j-1]+nums[i]);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
