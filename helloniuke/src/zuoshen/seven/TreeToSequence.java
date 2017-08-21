package zuoshen.seven;

import zuoshen.six.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class TreeToSequence {
    public int[][] convert(TreeNode root) {
        // write code here
        List<Integer> listFirst = new LinkedList<Integer>();
        List<Integer> listSecond = new LinkedList<Integer>();
        List<Integer> listEnd = new LinkedList<Integer>();
        bianli1(listFirst, root);
        bianli2(listSecond, root);
        bianli3(listEnd, root);
        int[][] result = new int[3][listFirst.size()];
        for (int j = 0;j < listFirst.size();j++) {
            result[0][j] = listFirst.get(j);
            result[1][j] = listSecond.get(j);
            result[2][j] = listEnd.get(j);
        }
        return result;
    }
    private void bianli1(List<Integer> list, TreeNode root) {
        // 先序遍历
        if (root == null) {
            return;
        }
        list.add(root.val);
        bianli1(list, root.left);
        bianli1(list, root.right);
    }

    private void bianli2(List<Integer> list, TreeNode root) {
        // 中序遍历
        if (root == null) {
            return;
        }
        bianli2(list, root.left);
        list.add(root.val);
        bianli2(list, root.right);
    }

    private void bianli3(List<Integer> list, TreeNode root) {
        // 后序遍历
        if (root == null) {
            return;
        }
        bianli3(list, root.left);
        bianli3(list, root.right);
        list.add(root.val);
    }
}
