package alibaba.one;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int maxMount(int price, int cap, int emptyBottle, int money) {
        if(money<price){
            return 0;
        }
        int count = money/price;
        int nCap = count;
        int nBottle = count;
        while(nCap>=cap||nBottle>=emptyBottle){
            System.out.println(nCap+" "+nBottle);
            if(nCap/cap!=0){
                int capCount = nCap/cap;
                count+=capCount;
                nCap = nCap%cap+capCount;
                nBottle +=capCount;
            }
            if(nBottle/emptyBottle!=0){
                int bottleCount = nBottle/emptyBottle;
                count+=bottleCount;
                nBottle = nBottle%emptyBottle+bottleCount;
                nCap += bottleCount;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _price;
        _price = Integer.parseInt(in.nextLine().trim());

        int _cap;
        _cap = Integer.parseInt(in.nextLine().trim());

        int _emptyBottle;
        _emptyBottle = Integer.parseInt(in.nextLine().trim());

        int _money;
        _money = Integer.parseInt(in.nextLine().trim());

        res = maxMount(_price, _cap, _emptyBottle, _money);
        System.out.println(String.valueOf(res));

    }
}
