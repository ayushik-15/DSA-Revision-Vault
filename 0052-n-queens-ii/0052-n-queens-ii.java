class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                board[i][j] = '.';
            }
        }
        return helper(board,0);
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
    private int helper(char[][] board,int row){
        if(row==board.length){
            return 1;
        }
        int count=0;
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                count += helper(board,row+1);
                board[row][i]='.';
            }
        }
        return count;
    }
}