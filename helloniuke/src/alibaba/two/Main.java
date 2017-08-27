package alibaba.two;

import java.util.Scanner;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        char[] nums = new char[n * n];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(cin.nextLine());
        }
        nums = builder.toString().toCharArray();
        int[] flags = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (flags[i * n + j] != 1)
                    helper(nums, n, n, i, j, flags);
            }
        }
        System.out.println(count);
    }

    private static boolean helper(char[] nums, int rows, int cols, int i, int j, int[] flags) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || nums[index] == 0 || flags[index] == 1)
            return false;
        flags[index] = 1;
        if (!helper(nums, rows, cols, i - 1, j, flags)
                && !helper(nums, rows, cols, i + 1, j, flags)
                && !helper(nums, rows, cols, i, j - 1, flags)
                && !helper(nums, rows, cols, i, j + 1, flags)
                && !helper(nums, rows, cols, i - 1, j - 1, flags)
                && !helper(nums, rows, cols, i + 1, j + 1, flags)
                && !helper(nums, rows, cols, i + 1, j - 1, flags)
                && !helper(nums, rows, cols, i - 1, j + 1, flags)) {
            count++;
        }
        return true;
    }
}
