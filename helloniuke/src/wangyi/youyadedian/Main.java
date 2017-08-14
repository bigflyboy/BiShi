package wangyi.youyadedian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int count = 0;
        for(int i=1;i*i<=n;i++){
            //这个强转int一定要有
            if((Math.pow(i,2)+Math.pow((int)Math.sqrt(n-Math.pow(i,2)),2))==n)
                count = count+4;

        }

        System.out.println(count-4);
    }

}
