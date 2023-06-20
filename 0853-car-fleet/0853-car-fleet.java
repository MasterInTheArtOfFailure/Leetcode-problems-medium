import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    int n = position.length;
    int count = 0;
    double[] time = new double[n];
    for (int i = 0; i < n; i++) {
        time[i] = (double) (target - position[i]) / speed[i];
    }
    Map<Integer, Double> map = new TreeMap<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
        map.put(position[i], time[i]);
    }
    double cur = 0;
    for (double t : map.values()) {
        if (t > cur) {
            cur = t;
            count++;
        }
    }
    return count;
    }
}