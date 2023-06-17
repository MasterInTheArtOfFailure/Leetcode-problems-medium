import java.util.*;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int number = 1;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse right
            for (int i = colBegin; i <= colEnd; i++) {
                matrix[rowBegin][i] = number;
                number++;
            }
            rowBegin++;
            // Traverse down
            for (int i = rowBegin; i <= rowEnd; i++) {
                matrix[i][colEnd] = number;
                number++;
            }
            colEnd--;
            // Traverse left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    matrix[rowEnd][i] = number;
                    number++;
                }
            }
            rowEnd--;
            // Traverse up
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    matrix[i][colBegin] = number;
                    number++;
                }
            }
            colBegin++;
        }
        return matrix;
    }
}