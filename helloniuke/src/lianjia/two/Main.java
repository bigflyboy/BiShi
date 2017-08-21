package lianjia.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int r = cin.nextInt();
        int avg = cin.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i =0;i<n;i++){
            A.add(cin.nextInt());
            B.add(cin.nextInt());
        }
//        ArrayList<Integer> C = new ArrayList(B);
        int avgSum = avg*n;
        int honor = 0;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+A.get(i);
        }
//        Collections.sort(C);
        for(int i=0;i<n;i++){
            if(sum>=avgSum){
                break;
            }
            int num = Collections.min(B);
            int index = B.indexOf(num);
            int m = A.get(index);
            B.remove(index);
            A.remove(index);
            for(int j =0;j<r-m;j++){
                sum = sum+1;
                honor = honor+num;
                if(sum>=avgSum){
                    break;
                }
            }
        }
        System.out.println(honor);
    }
}
