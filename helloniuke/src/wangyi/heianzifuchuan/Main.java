package wangyi.heianzifuchuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        long number = cin.nextLong();
        long one = 3;
        long two = 9;
        long three = 0;
        if(number==1)
            System.out.println(3);
        else if(number==2)
            System.out.println(9);
        else{
            for(int i=3;i<=number;i++){
                three = 2*two+one;
                one = two;
                two = three;
            }
            System.out.println(three);
        }
    }
}
