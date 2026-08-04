class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }
        return solve(grid, 0, 0, 0);
    }
    private boolean solve(int[][] grid, int row, int col, int currentStep) {
        int n = grid.length;

        if(currentStep == n*n-1){
            return true;
        }

        int[] rowMoves = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] colMoves = {-1, 1, -2, 2, -2, 2, -1, 1};

        for(int i = 0;i < 8;i++) {
            int nextRow = row + rowMoves[i];
            int nextCol = col + colMoves[i];

            if(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n){
                if(grid[nextRow][nextCol] == currentStep + 1){
                    return solve(grid, nextRow, nextCol, currentStep + 1);
                }
            }
        }
        return false;
    }
}