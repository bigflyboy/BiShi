package wangyibishi.ti0;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String string = cin.next();
        char[] nums = string.toCharArray();
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],"");
        }
        if(map.size()>2){
            System.out.println(0);
        }else{
            System.out.println(2);
        }
    }

}
