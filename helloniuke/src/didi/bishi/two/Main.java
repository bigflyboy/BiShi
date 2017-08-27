package didi.bishi.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String num = cin.nextLine();
        String[] nums = num.split(" ");
        for (int i = 0; i < nums.length; i++) {
            list.add(Integer.valueOf(nums[i]));
        }
        int k = cin.nextInt();
        Collections.sort(list);
        System.out.println(list.get(list.size()-k));
    }
}
