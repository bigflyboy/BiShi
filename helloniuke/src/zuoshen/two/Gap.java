package zuoshen.two;

import java.util.Arrays;

public class Gap {

    public int maxGap(int[] A, int n) {
        Arrays.sort(A);
        int[] B = new int[n-1];
        for(int i=0;i<n-1;i++){
            B[i] = A[i+1]-A[i];
        }
        Arrays.sort(B);
        return B[B.length-1];
    }
}
