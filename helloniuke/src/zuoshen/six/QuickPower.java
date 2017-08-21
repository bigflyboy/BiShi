package zuoshen.six;

public class QuickPower {
    public int getPower(int k, int N) {
        long res=1;
        for(int i=0;i<N;i++){
            res=res*k%1000000007;
        }
        return (int)res;
    }
}
