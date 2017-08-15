package zuoshen.three;

import java.util.HashMap;
import java.util.Map;

public class DistincSubstring {
    public int longestSubstring(String A, int n) {
        if (A == null) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;

        Map<Character, Integer> posMap = new HashMap<>();
        int pre = 0;
        int posA = -1;
        int posB = -1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            char key = A.charAt(i);
            if (!posMap.containsKey(key)) {
                posMap.put(key, i);
                pre++;
            } else {
                posA = posMap.get(key) + 1;
                posB = i - pre;
                if (posA > posB) {
                    pre = i - posA + 1;
                }else{
                    pre++;
                }
                posMap.put(key,i);
            }
            if(pre>res){
                res = pre;
            }
        }
        return res;
    }
}
