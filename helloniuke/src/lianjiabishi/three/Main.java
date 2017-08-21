package lianjiabishi.three;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int one = 1;
        int two = 1;
        if(n == 1){
            System.out.println(1);
        }else if(n==2){
            System.out.println(1);
        }else{
            int num = 0;
            for(int i=0;i<n-2;i++){
                num = one+two;
                one = two;
                two = num;
            }
            System.out.println(num);
        }


    }
}
