package zuoshen.Intelligence;

public class Paint {
    public int getMost(int n, int m) {
        if(n%2==0||m%2==2){
            return n*m/2;
        }else{
            return n*m/2+1;
        }
    }
}
