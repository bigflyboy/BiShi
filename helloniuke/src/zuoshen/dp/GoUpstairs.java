package zuoshen.dp;

public class GoUpstairs {
    public int countWays(int n) {
        int n1 = 1;
        int n2 = 2;
        int fn = 0;
        for(int i=3;i<=n;i++){
            fn = (n1+n2)%1000000007;
            n1 = n2;
            n2 = fn;
        }
        return fn;
    }
}
