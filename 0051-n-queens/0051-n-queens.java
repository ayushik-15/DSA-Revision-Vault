class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for (int i=0;i< n;i++){
            for (int j=0;j< n;j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0, result);
        return result;
    }
    private void nQueens(char[][] board, int row,List<List<String>>result){
        if(row==board.length){
            result.add(constructBoard(board));
            return;
        }

        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                nQueens(board, row + 1, result);
                board[row][i] = '.'; 
            }
        }
    }
    private boolean isSafe(char[][] board,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    private List<String> constructBoard(char[][] arr) {
        List<String> currentBoard = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            currentBoard.add(new String(arr[i]));
        }
        return currentBoard;
    }
}