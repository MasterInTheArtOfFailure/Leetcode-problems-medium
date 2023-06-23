class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = findMax(piles);

        while (left < right) {
            int mid = (left + right) / 2;
            if(eatAll(piles, h, mid)) {
                right = mid;
            } else left = mid + 1;
        }
        return left;
    }

    public boolean eatAll(int[] piles, int h, int k) {
        int time = 0;
        for (int x : piles) {
            time += (x - 1) / k + 1;
        }
        return time <= h;
    }
    public int findMax(int[] piles) {
        int max = 0;
        for(int x : piles) {
            max = Math.max(max, x);
        }
        return max;
    }
}