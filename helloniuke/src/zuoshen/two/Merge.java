package zuoshen.two;

import java.util.Arrays;

public class Merge {

    public int[] mergeAB(int[] A, int[] B, int n, int m) {
        for(int i=0;i<m;i++){
            A[n+i] = B[i];
        }
        Arrays.sort(A);
        return A;
    }

}
