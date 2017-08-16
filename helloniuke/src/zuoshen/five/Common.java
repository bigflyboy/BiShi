package zuoshen.five;

import java.util.ArrayList;

public class Common {
    public int[] findCommonParts(ListNode headA, ListNode headB) {
        ArrayList<Integer> list = new ArrayList<>();
        while(headA!=null&&headB!=null){
            if(headA.val==headB.val){
                list.add(headA.val);
                headA = headA.next;
                headB = headB.next;
            }else if(headA.val>headB.val){
                headB = headB.next;
            }else{
                headA = headA.next;
            }
        }
        int[] nums = new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
