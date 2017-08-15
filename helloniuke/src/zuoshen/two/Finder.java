package zuoshen.two;

public class Finder {
    public boolean findX(int[][] mat, int n, int m, int x) {
        int i = n-1;
        int j = 0;
        while(i>=0&&j<=m-1){
            if(mat[i][j]==x){
                return true;
            }else if(mat[i][j]>x){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}
