package zuoshen.one02;

public class Rotation {

    public boolean chkRotation(String A, int lena, String B, int lenb) {
        if(A.length()!=B.length())
            return false;
        String NewA = A + A;
        if(NewA.indexOf(B)!=-1)
            return true;
        return false;
    }
}
