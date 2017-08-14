package didi.canguan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int zhuozi[] = new int[n];
        int PersonNum[] = new int[m];
        int PersonMoney[] = new int[m];
        for (int i = 0; i < n; i++) {
            zhuozi[i] = cin.nextInt();
        }
        for (int i = 0; i < m; i++) {
            PersonNum[i] = cin.nextInt();
            PersonMoney[i] = cin.nextInt();
        }
        int dp[][] = new int[n][m];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (PersonNum[j] > zhuozi[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    if (dp[i - 1][j] > dp[i - 1][j - zhuozi[i]] + PersonMoney[j]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
    }
}
