/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        int rowBegin = 0;
        int rowEnd = m - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        ListNode current = head;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse right
            for (int i = colBegin; i <= colEnd; i++) {
                if (current != null) {
                    result[rowBegin][i] = current.val;
                    current = current.next;
                } else {
                    result[rowBegin][i] = -1;
                }
            }
            rowBegin++;
            // Traverse down
            for (int i = rowBegin; i <= rowEnd; i++) {
                if (current != null) {
                    result[i][colEnd] = current.val;
                    current = current.next;
                } else {
                    result[i][colEnd] = -1;
                }
            }
            colEnd--;
            // Traverse left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    if (current != null) {
                        result[rowEnd][i] = current.val;
                        current = current.next;
                    } else {
                        result[rowEnd][i] = -1;
                    }
                }
            }
            rowEnd--;
            // Traverse up
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    if (current != null) {
                        result[i][colBegin] = current.val;
                        current = current.next;
                    } else {
                        result[i][colBegin] = -1;
                    }
                }
            }
            colBegin++;
        }
        return result;
    }
}