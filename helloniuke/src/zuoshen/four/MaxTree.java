package zuoshen.four;

import java.util.Stack;

public class MaxTree {
    public int[] buildMaxTree(int[] A, int n) {
        // write code here
        int[] res = new int[A.length];
        Stack<Integer> stack = new Stack<Integer>();
        // 找到左边大于该值的下标
        for (int i = 0; i < A.length; i++) {
            // 栈中元素值必须top < bottom
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        // 找到左右两边大于该值中较小的那个的下标。
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                stack.pop();
            }
            // 当前找不到最右边的第一个大于的值的时候，即stack 为空时，直接采用左边找到比它大值的下表。
            // stack非空时，如果左边没有较大值，或者右边找到更小值，更新数组。
            if (!stack.isEmpty() && (res[i] == -1 || A[stack.peek()] < A[res[i]]) ){
                // 找到左右两边中较小那个值的下标
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
