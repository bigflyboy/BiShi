package lianjiabishi.bukao.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int sumN = 0;
        int sumM = 0;
        int n = cin.nextInt();
        int[] N = new int[n];
        for(int i=0;i<n;i++){
            N[i] = cin.nextInt();
            sumN = sumN+N[i];
        }
        int m = cin.nextInt();
        int[] M = new int[m];
        for(int i = 0;i<m;i++){
            M[i] = cin.nextInt();
            sumM = sumM+M[i];
        }
        double avgN = sumN/n;
        double avgM = sumM/m;
        int countN = 0;
        int countM = 0;
        for(int i=0;i<n;i++){
            if(N[i]*n<=sumN){
                countN++;
            }
        }
        for(int i=0;i<m;i++){
            if(N[i]*m>=sumM){
                countM++;
            }
        }
        System.out.println(Math.min(countN,countM));
    }
}
