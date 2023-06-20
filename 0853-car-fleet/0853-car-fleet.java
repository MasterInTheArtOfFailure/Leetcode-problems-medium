import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
    int count = 0;
    Stack<Double> stack = new Stack<>();
    Map<Integer, Double> map = new TreeMap<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
        map.put(position[i], (double) (target - position[i]) / speed[i]);
    }
    for (double t : map.values()) {
        while (!stack.isEmpty() && t > stack.peek()) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            count++;
            stack.push(t);
        }
    }
    return count;
    }
}