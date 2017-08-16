package zuoshen.five;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClearValue {

    public ListNode clear(ListNode head, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node = head;
        if(head.val == val){
            head = head.next;
            node.next = null;
            node = head;
        }
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        int i = 0;
        node = head;
        while (node != null) {
            if (list.get(i) != val) {
                node.val = list.get(i);
                if (i == list.size()-1) {
                    node.next = null;
                    break;
                }
                node = node.next;
            }
            i++;

        }
        return head;
    }
}
