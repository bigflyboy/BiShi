package zuoshen.two;

import java.util.HashSet;

public class Checker {

    public boolean checkDuplicate(int[] a, int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        return set.size()!=n?true:false;
    }
}
