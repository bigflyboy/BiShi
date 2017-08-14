package zuoshen.one01;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TreePrinter {

    public int[][] printTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();
        if(root!=null){
            return null;
        }
        TreeNode last = root;
        TreeNode nLast = null;
        queue.add(root);
        ArrayList<Integer> array = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.peek();
            queue.poll();
            if(temp.left!=null){
                queue.add(temp.left);
                nLast = temp.left;
            }
            if(temp.right!=null){
                queue.add(temp.right);
                nLast = temp.right;
            }
            array.add(temp.val);
            if(temp==last){
                arrays.add(array);
                last=nLast;
                array.clear();
            }
        }
        int[][] arr = new int[arrays.size()][Math.max(arrays.get(arrays.size()-1).size(),arrays.get(arrays.size()-2).size())];
        for(int i =0;i<arrays.size();i++){
            for(int j =0;j<arrays.get(i).size();i++){
                arr[i][j] = arrays.get(i).get(j);
            }
        }
        return arr;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}