package zuoshen.two;

public class QuickSort {
    public int[] quickSort(int[] A, int n) {

        quick(A, 0, n - 1);

        return A;
    }

    public void quick(int[] A, int start, int end) {
        //这句是关键
        if(start<end){
            int a = A[start];
            int left = start;
            int right = end;
            int temp = 0;
            while (left < right) {
                while (left < right && A[right] >= a) {
                    right--;
                }
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                while (left < right && A[left] <= a) {
                    left++;
                }
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;

            }
            quick(A, start, left - 1);
            quick(A, left + 1, end);
        }

    }

    public static void main(String[] args){
        QuickSort sort = new QuickSort();
        int[] arrays = {54,35,48,36,27,12,44,44,8,14,26,17,28};

        sort.quickSort(arrays,arrays.length);
        for(int i = 0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
    }

}
