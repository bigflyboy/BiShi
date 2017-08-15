package zuoshen.three;

import java.util.HashMap;

public class Transform {
    public boolean chkTransform(String A, int lena, String B, int lenb) {
        if(lena!=lenb)
            return false;
        HashMap<Character,Integer> aMap = new HashMap<>();
        HashMap<Character,Integer> bMap = new HashMap<>();
        char[] achr = A.toCharArray();
        char[] bchr = B.toCharArray();
        for(int i =0;i<A.length();i++){
            if(aMap.containsKey(achr[i])){
                aMap.put(achr[i],aMap.get(achr[i])+1);
            }else{
                aMap.put(achr[i],1);
            }
        }
        for(int i =0;i<B.length();i++){
            if(bMap.containsKey(bchr[i])){
                bMap.put(bchr[i],bMap.get(bchr[i])+1);
            }else{
                bMap.put(bchr[i],1);
            }
        }
        if(aMap.size()==bMap.size()){
            for(int i=0;i<A.length();i++){
                if(bMap.containsKey(achr[i])){
                    if(aMap.get(achr[i])!=bMap.get(achr[i]))
                        return false;
                }else {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
