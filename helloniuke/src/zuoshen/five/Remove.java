package zuoshen.five;

public class Remove {
    public ListNode removeNode(ListNode pNode, int delVal) {
        if (pNode == null)
            return pNode;
        ListNode pHead = pNode;
        ListNode pFrist = pHead;
        if(pNode.val==delVal){
            pNode = pNode.next;
            pHead.next = null;
            return pNode;
        }
        while (pHead != null && pHead.val != delVal) {
            pFrist = pHead;
            pHead = pHead.next;
        }
        if(pHead==null){
            return pNode;
        }else{
            if(pHead.next==null){
                pFrist.next =null;
            }else{
                pFrist.next = pHead.next;
                pHead.next = null;
            }
            return pNode;
        }
    }
}
