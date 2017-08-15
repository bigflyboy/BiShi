package zuoshen.four;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i=numbers.length-1;i>=0;i--){
            list.add(numbers[i]);
        }
        return list;
    }
}
