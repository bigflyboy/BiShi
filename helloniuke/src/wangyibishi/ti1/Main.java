package wangyibishi.ti1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = cin.nextInt();
        }
        if(n%2==0){
            for(int i =0;i<n/2;i++){
                System.out.print(nums[n-1-2*i]+" ");

            }
        }else{
            for(int i =0;i<n/2+1;i++){
                System.out.print(nums[n-1-2*i]+" ");

            }
        }

            if(n%2==0){
                for(int i=0;i<n/2;i++) {
                    if (i == n / 2 - 1) {
                        System.out.print(nums[2 * i]);
                    } else {
                        System.out.print(nums[2 * i] + " ");
                    }
                }
            }else{
                for(int i=0;i<n/2;i++) {
                    if (i == n / 2 - 1) {
                        System.out.print(nums[2 * i + 1]);
                    } else {
                        System.out.print(nums[2 * i + 1] + " ");
                    }
                }
            }


    }
}
