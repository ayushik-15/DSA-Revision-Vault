class Solution {
    public int uniquePaths(int m, int n) {
        int N= n+m-2;
        int M= n-1;
        long ans =1;

        for(int i=1;i<=M;i++){
            ans=ans*(N-M+i)/i;
        }
        return(int)ans;
    }
}