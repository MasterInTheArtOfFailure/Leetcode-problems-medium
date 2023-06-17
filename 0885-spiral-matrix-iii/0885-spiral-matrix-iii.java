class Solution {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        //storing [x, y] values
        int[][] res = new int[rows * cols][2];
        //adding to x and y for every direction
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int len = 0, d = 0, x = rStart, y = cStart;
        res[0] = new int[]{x, y};
        int count = 1;
        while(count < rows * cols) {
            //length of traversal in direction increases each 2 turns: 1, 1, 2, 2, 3...
            if (d == 0 || d == 2) len++;
            for (int j = 0; j < len; j++) {
                x += dirs[d][0];
                y += dirs[d][1];
                //check if out of bounds, then add
                if (x >= 0 && x < rows && y >= 0 && y < cols) {
                    res[count] = new int[]{x, y};
                    count++;
                    if (count == rows * cols) return res;
                }
            }
            //add 1 to index in dirs
            d = (d + 1) % 4;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(spiralMatrixIII(1, 4, 0,0));
    }
}