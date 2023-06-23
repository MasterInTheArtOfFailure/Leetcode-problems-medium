import java.util.*;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1, right = 1L * maxArr(ranks) * cars * cars;
        while (left < right) {
            long mid = (left + right) / 2, cur = 0;
            for (int i : ranks)
                cur += (long)(Math.sqrt(1.0 * mid / i));
            if (cur < cars)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public int maxArr(int[] ranks) {
        int max = 0;
        for (int i: ranks) {
            max = Math.max(max, i);
        }
        return max;
    }
}