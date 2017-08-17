package zuoshen.five;

import java.util.ArrayList;

public class Palindrome {

    public boolean isPalindrome(ListNode pHead) {
        if(pHead==null){
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(pHead!=null){
            list.add(pHead.val);
            pHead = pHead.next;
        }
        for(int i=0;i<list.size()/2;i++){
            if(list.get(i)!=list.get(list.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}
