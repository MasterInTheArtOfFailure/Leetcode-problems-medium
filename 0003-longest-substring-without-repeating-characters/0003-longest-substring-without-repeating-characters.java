
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0; int j = 0;
        HashSet<Character> hashSet = new HashSet<>();

        while(j < s.length()) {
            if(!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j++));
                max = Math.max(max, hashSet.size());
            } else {
                hashSet.remove(s.charAt(i++));
            }
        }
        return max;
    }
}