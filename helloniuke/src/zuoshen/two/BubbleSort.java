package zuoshen.two;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }
}
