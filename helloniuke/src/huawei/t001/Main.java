package huawei.t001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        String[] sqlit = str.split(" ");
        System.out.println(sqlit[sqlit.length-1].length());
    }

}
