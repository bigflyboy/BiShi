package wangyi.tiaoshiban;

import java.util.Scanner;

public class Main {

    public static int count =0;
    public static boolean flag = false;

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        count = 0;
        flag = false;
        int n = cin.nextInt();
        int m = cin.nextInt();
        tiao(n,m);
        if(flag){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }

    public static void tiao(int n,int m){
        if(n>m)
            return;
        if(n==m){
            flag = true;
            return;
        }

        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                count++;
                tiao(n+n/i,m);
                if(flag){
                    break;
                }
                count--;
            }
        }

    }

}
