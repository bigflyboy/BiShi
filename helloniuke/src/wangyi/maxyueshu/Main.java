package wangyi.maxyueshu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        System.out.println(maxji(n));
    }
    public static long maxji(long n){
        if(n==1){
            return 1;
        }else{
            if(n%2==0){
                return n*n/4+maxji(n/2);
            }else{
                return (n+1)*(n+1)/4+maxji(n/2);
            }
        }
    }
}
