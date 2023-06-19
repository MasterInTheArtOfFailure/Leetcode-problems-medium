import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i:nums) {
            set.add(i);
        }

        int result = 0;
        for(int i:set) {
            if(!set.contains(i - 1)) {
                int currentLength = 1;
                int currentNum = i;
                while(set.contains(currentNum + 1)) {
                    currentLength++;
                    currentNum++;
                }
                result = Math.max(result, currentLength);
            }
        }
        return result;
    }
}