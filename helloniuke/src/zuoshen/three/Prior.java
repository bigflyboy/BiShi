package zuoshen.three;

import java.util.Arrays;
import java.util.Comparator;

public class Prior {

    public String findSmallest(String[] strs, int n) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1+o2;
                String str2 = o2+o1;
                return str1.compareTo(str2);
            }
        });
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<strs.length;i++){
            builder.append(strs[i]);
        }
        return builder.toString();
    }
}
