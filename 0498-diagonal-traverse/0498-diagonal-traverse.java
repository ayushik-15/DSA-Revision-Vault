class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length ==0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int arr[] = new int[m*n];
        int r = 0, c=0, i=0;
        boolean found =  true;

        while(r<m && c<n){
            if(found){
                while(r>0 && c<n-1){
                    arr[i++] = mat[r][c];
                    r--;
                    c++;
                }
                arr[i++] = mat[r][c];
                if(c == n-1){
                    r++;
                }else{
                    c++;
                }
            }else{
                while(c>0 && r<m-1){
                    arr[i++] = mat[r][c];
                    r++;
                    c--; 
                }
                arr[i++] = mat[r][c];
                if(r == m-1){
                    c++;
                }else{
                    r++;
                }
            }
            found = !found;
        }
        return arr;
    }
}