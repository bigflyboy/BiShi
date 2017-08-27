package didi.bishi.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String num = cin.nextLine();
        String[] nums = num.split(" ");
        for (int i = 0; i < nums.length; i++) {
            list.add(Integer.valueOf(nums[i]));
        }
        int sum = list.get(0);
        int total = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (total >= 0) {
                total += list.get(i);
            } else {
                total = list.get(i);
            }
            if (total > sum)
                sum = total;
        }
        System.out.println(sum);
    }
}
