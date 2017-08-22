package zuoshen.Intelligence;

import java.util.Arrays;

public class HorseRace {
    public int winMost(int[] oppo, int[] horses, int n) {
        // write code here
        int i = 0;
        int j = 0;
        int count = 0;
        Arrays.sort(oppo);
        Arrays.sort(horses);
        while (i < n && j < n) {
            if (oppo[i] < horses[j]) {
                i++;
                j++;
                count++;
            } else {
                j++;
            }
        }
        return count;
    }
}
