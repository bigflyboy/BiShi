package zuoshen.two;

public class HeapSort {

    public int[] heapSort(int[] H, int length) {
        BuildHeap(H,length);
        for(int i=length-1;i>0;i--){
            int temp = H[i];
            H[i] = H[0];
            H[0] = temp;
            HeadAdjust(H,0,i);
        }

        return H;
    }

    public void HeadAdjust(int[] H, int s, int length) {
        int tmp = H[s];
        int child = 2 * s + 1;
        while (child < length) {
            if (child + 1 < length && H[child] < H[child + 1]) {
                child++;
            }
            if (H[s] < H[child]) {
                H[s] = H[child];
                s = child;
                child = 2 * s + 1;
            } else {
                break;
            }
            H[s]=tmp;
        }
    }

    public void BuildHeap(int[] H,int length){
        for(int i=(length-1)/2;i>=0;i--){
            HeadAdjust(H,i,length);
        }
    }

    public void sort(int[] H,int length){

    }

}
