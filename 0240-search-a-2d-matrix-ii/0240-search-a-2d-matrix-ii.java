class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int topRow = 0;
        int topCol = cols - 1;

        int botRow = rows - 1;
        int botCol = 0;

        /*
        we know that going down and right number is increasing and
        going top and left its decreasing, so if move from both corners at the same time
        we cover both halves of matrix
        the steps for top right are down and left, for bot left up and right
        */

        while(checkIndexes(topRow, topCol, botRow, botCol, rows, cols)) {
            if(target == matrix[topRow][topCol] || target == matrix[botRow][botCol]) return true;
            if(matrix[topRow][topCol] < target) topRow++;
            else topCol--;
            if(matrix[botRow][botCol] > target) botRow--;
            else botCol++;
        }
        return false;
    }

    public static boolean checkIndexes(int topRow, int topCol, int botRow, int botCol, int rows, int cols) {
        return topRow < rows && topCol >= 0 &&
               botRow >= 0 && botCol < cols &&
            //the top right pointer will never go past diagonal
               botCol <= topCol && botRow >= topRow;
    }
}