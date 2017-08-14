package wangyi.jiqirenyundong;

public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        if(rows<=0||cols<=0)
            return 0;
        int count = 0;
        int[] flag = new int[rows*cols];
        canPath(threshold,rows,cols,0,0,flag);
        for(int i:flag){
            if(i==1)
                count++;
        }
        return count;
    }

    public void canPath(int threshold,int rows,int cols,int i,int j,int[] flag){
        int index = i*cols+j;
        if(i<0||i>=rows||j<0||j>=cols||!isThreshold(threshold,i,j)||flag[index]==1){
            return;
        }
        flag[index]=1;
        canPath(threshold,rows,cols,i-1,j,flag);
        canPath(threshold,rows,cols,i+1,j,flag);
        canPath(threshold,rows,cols,i,j-1,flag);
        canPath(threshold,rows,cols,i,j+1,flag);
    }

    public boolean isThreshold(int threshold,int i,int j){
        if((i/10+i%10+j/10+j%10)<=threshold)
            return true;
        else
            return false;
    }
}
