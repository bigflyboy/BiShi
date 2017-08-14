package wangyi.huiwen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = cin.nextInt();
        }
        int m =0;
        int count = 0;
        while(m<n){
            if(nums[m]>nums[n-1]){
                n--;
                nums[n-1] = nums[n]+nums[n-1];
                count++;
            }else if(nums[m]<nums[n-1]){
                m++;
                nums[m] = nums[m-1]+nums[m];
                count++;
            }else{
                n--;
                m++;
            }
        }
        System.out.println(count);
    }
}
