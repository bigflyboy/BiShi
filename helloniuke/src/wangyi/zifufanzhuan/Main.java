package wangyi.zifufanzhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String a = reverse(cin.next());
        String b = reverse(cin.next());
        int num = Integer.valueOf(a)+Integer.valueOf(b);
        System.out.println(Integer.valueOf(reverse(String.valueOf(num))));
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
