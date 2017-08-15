package zuoshen.three;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        char[] chr = iniString.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<chr.length;i++){
            if(chr[i]==' '){
                builder.append("%20");
            }else{
                builder.append(chr[i]);
            }
        }
        return builder.toString();
    }
}
