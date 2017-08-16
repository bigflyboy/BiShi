package zuoshen.five;

import java.util.ArrayList;

public class Divide {
    public ListNode listDivide(ListNode head, int val) {
        if(head==null||head.next==null)
            return head;
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ListNode node = head;
        while(node!=null){
            if(node.val<=val){
                one.add(node.val);
            }else{
                two.add(node.val);
            }
            node = node.next;
        }
        one.addAll(two);
        node = head;
        int i =0;
        while(node!=null){
            node.val = one.get(i);
            i++;
            node = node.next;
        }
        return head;
    }
}
