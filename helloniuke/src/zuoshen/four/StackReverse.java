package zuoshen.four;

import java.util.Arrays;

public class StackReverse {
    public int[] reverseStack(int[] A, int n) {
        for(int i=0;i<A.length/2;i++){
            int temp = A[i];
            A[i] =A[n-1-i];
            A[n-1-i] = temp;
        }
        return A;
    }
}
