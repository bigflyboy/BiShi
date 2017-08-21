package lianjia.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n =cin.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i =0;i<n;i++){
            nums.add(cin.nextInt());
        }
        Collections.sort(nums);
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==nums.get(i+1)){
                nums.remove(i);
            }
        }
        System.out.println(nums.size());
        for(int i =0;i<nums.size();i++){
            if(i==0){
                System.out.print(nums.get(i));
            }else{
                System.out.print(" "+nums.get(i));
            }
        }
    }


}
