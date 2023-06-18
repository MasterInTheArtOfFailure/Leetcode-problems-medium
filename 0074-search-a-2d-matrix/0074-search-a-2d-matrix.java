class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        /*think of sorted 2d array as a sorted 1d array, mid / n is the whole part of searching for a mid value, mid % n is the remainder, so we can traverse the row*/
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = matrix[mid / n][mid % n];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}