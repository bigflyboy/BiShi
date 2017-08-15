package zuoshen.three;

public class reverseSentence {

    public String reverseSentence(String A, int n) {
        String B = reverse(A);
        String[] strs = B.split(" ");
        for(int i=0;i<strs.length;i++){
            strs[i] = reverse(strs[i]);
        }
        StringBuilder builder = new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            builder.append(" "+strs[i]);

        }

        return builder.toString();
    }

    public String reverse(String str){
        char[] chr = str.toCharArray();
        for(int i=0;i<chr.length/2;i++){
            char temp = chr[i];
            chr[i] = chr[chr.length-i-1];
            chr[chr.length-i-1] = temp;
        }
        return new String(chr);
    }
}
