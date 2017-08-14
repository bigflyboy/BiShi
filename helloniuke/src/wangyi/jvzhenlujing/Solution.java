package wangyi.jvzhenlujing;

import java.util.Stack;

public class Solution {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length != (rows * cols) || matrix.length < str.length) {
            return false;
        }
        int flag[] = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (findStr(matrix, rows, cols, i, j, str, 0, flag))
                    return true;
            }
        }
        return false;
    }

    public static boolean findStr(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
            return false;
        if (k == str.length - 1)
            return true;
        flag[index] = 1;
        if (findStr(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || findStr(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                ||findStr(matrix, rows, cols, i, j-1, str, k + 1, flag)
                ||findStr(matrix, rows, cols, i, j+1, str, k + 1, flag) )
            return true;
        flag[index]=0;
        return false;
    }

}
