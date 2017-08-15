package zuoshen.four;

import java.util.Stack;

public class Solution {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stackFuZhu = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(stackFuZhu.isEmpty()){
            stackFuZhu.push(node);
        }else{
            if(node>=stackFuZhu.peek()){
                stackFuZhu.push(stackFuZhu.peek());
            }else{
                stackFuZhu.push(node);
            }
        }
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
            stackFuZhu.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackFuZhu.peek();
    }

}
