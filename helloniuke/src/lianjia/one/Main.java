package lianjia.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = cin.nextInt();
        }
        int count = 0;
        int left = 0;
        int right = n-1;
        while(left<right){
            while(nums[left]==1){
                left++;
            }
            while(nums[right]!=1){
                right--;
            }
            if(left<right){
                swap(nums,left,right);
                count++;
                left++;
                right--;
            }

        }
        left = 0;
        right = n-1;
        while(left<right){
            while(nums[left]!=3){
                left++;
            }
            while(nums[right]==3){
                right--;
            }
            if(left<right){
                swap(nums,left,right);
                count++;
                left++;
                right--;
            }

        }
        System.out.println(count);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
