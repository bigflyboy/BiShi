package zuoshen.four;

import java.util.Deque;
import java.util.LinkedList;

public class SlideWindow {
    public int[] slide(int[] arr, int n, int w) {
        // write code here
        int[] res = new int[arr.length - w + 1];
        if (arr == null || w > n) {
            return res;
        }
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            // 尾部删除元素
            if (!deque.isEmpty() && deque.peekLast() <= i - w) {
                deque.pollLast();
            }
            // 头部删除元素
            while (!deque.isEmpty() && arr[deque.peekFirst()] < arr[i]) {
                deque.pollFirst();
            }
            // 头部添加元素, 只添加更大的元素
            if (deque.isEmpty() || arr[deque.peekFirst()] >= arr[i]) {
                deque.offerFirst(i);
            }
            //
            if (i >= w - 1) {
                res[i - w + 1] = arr[deque.peekLast()];
            }
        }
        return res;
    }
}
