package zuoshen.six;

public class Sulotion {
    public int getLessIndex(int[] arr) {
        for(int i =0;i<arr.length-1;i++){
            if(i==0&&arr[i]<arr[i+1]){
                return 0;
            }
            if(i>0&&arr[i-1]>arr[i]&&arr[i+1]>arr[i]){
                return i;
            }
        }
        return -1;
    }
}
