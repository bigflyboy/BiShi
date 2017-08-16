package zuoshen.five;

import java.util.ArrayList;
import java.util.Collections;

public class KInverse {
    public ListNode inverse(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        int m = 0;
        for (int i = m; i < k + m; i++) {
            if (k + m > list.size()) {
                break;
            }
            for (int j = 0; j < k / 2; j++) {
                Collections.swap(list, m + j, m + k - 1 - j);
            }
            m = m + k;
        }
        node = head;
        int i = 0;
        while (node != null) {
            node.val = list.get(i);
            i++;
            node = node.next;
        }
        return head;
    }
}
