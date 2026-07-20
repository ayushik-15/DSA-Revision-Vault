class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];
        
        for (int[] index : indices) {
            rowCounts[index[0]]++;
            colCounts[index[1]]++;
        }
        int oddRows = 0;
        for (int r = 0; r < m; r++) {
            if (rowCounts[r] % 2 != 0) {
                oddRows++;
            }
        }
        int oddCols = 0;
        for (int c = 0; c < n; c++) {
            if (colCounts[c] % 2 != 0) {
                oddCols++;
            }
        }
        int evenRows = m - oddRows;
        int evenCols = n - oddCols;
        return (oddRows * evenCols) + (evenRows * oddCols); 
    }
}