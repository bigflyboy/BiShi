package wangyi.maipingguo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int count = 0;
        if(n<6){
            System.out.println(-1);
        }else{
            if(n%8==0){
                System.out.println(n/8);
            }else{
                for(int i = n/8;i>=0;i--){
                    for(int j=0;j<=n/6;j++){
                        if(i*8+j*6==n){
                            count = i+j;
                            break;
                        }else if(i*8+j*6>n){
                            break;
                        }
                    }
                    if(count!=0){
                        break;
                    }
                }
                if(count!=0){
                    System.out.println(count);
                }else{
                    System.out.println(-1);
                }

            }
        }
    }
}
