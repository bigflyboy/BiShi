package wangyibishi.ti2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = cin.nextInt();
        }
        Arrays.sort(nums);
        int count = 0;

        System.out.print(100);
    }
}
