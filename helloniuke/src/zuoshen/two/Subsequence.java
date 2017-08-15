package zuoshen.two;

public class Subsequence {

    public int shortestSubsequence(int[] A, int n) {
        int x = 0;
        int y = 0;
        int left = A[0];
        int right = A[n-1];
        for(int i=0;i<n;i++){
            if(A[i]>left){
                left = A[i];
            }else if(A[i]<left){
                x = i;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(A[i]<right){
                right = A[i];
            }else if(A[i]>right){
                y = i;
            }
        }
        if(x-y>0){
            return x-y+1;
        }else{
            return 0;
        }
    }
}
