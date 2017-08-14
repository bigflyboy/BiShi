package wangyi.tanguo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int one = cin.nextInt();
        int two = cin.nextInt();
        int three = cin.nextInt();
        int four = cin.nextInt();
        if((three-one)%2!=0||(four-two)%2!=0){
            System.out.println("No");
        }else{
            int b = (three-one)/2;
            int c = (four-two)/2;
            int a = one+b;
            if(a<0||b<0||c<0){
                System.out.println("No");
            }else{
                System.out.println(a+" "+b+" "+c);
            }
        }
    }
}
