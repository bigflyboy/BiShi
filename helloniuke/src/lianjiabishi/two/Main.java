package lianjiabishi.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int num = 2;
        while(n>0){
            if(m(num)){
                n--;
                if(n==0)
                    break;
            }
            num++;
        }
        System.out.println(num);

    }

    public static boolean  m(int num){

        for(int j = 2; j<=Math.sqrt(num);j++){
            if(num%j == 0){
                return false;
            }
        }

        return true;
    }
}
