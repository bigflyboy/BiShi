package zuoshen.three;

public class Translation {

    public String stringTranslation(String A, int n, int len) {

        String B = A + A;
        return B.substring(len,len+n);
    }
}
