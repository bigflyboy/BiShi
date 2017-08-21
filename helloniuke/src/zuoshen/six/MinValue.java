package zuoshen.six;

import java.util.Arrays;

public class MinValue {
    public int getMin(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[0];
    }
}
