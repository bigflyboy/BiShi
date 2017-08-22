package lianjiabishi.bukao.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String A = cin.next();
        String B = cin.next();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int[][] len = new int[a.length+1][b.length+1];
        for(int i =0;i<a.length;i++){
            for(int j =0;j<b.length;j++){
                if(a[i]==b[j]){
                    len[i+1][j+1] = len[i][j]+1;
                }else {
                    if (len[i][j + 1] > len[i + 1][j]) {
                        len[i + 1][j + 1] = len[i][j + 1];
                    } else {
                        len[i + 1][j + 1] = len[i + 1][j];
                    }
                }
            }
        }
        System.out.println(len[a.length][b.length]);
    }

}
