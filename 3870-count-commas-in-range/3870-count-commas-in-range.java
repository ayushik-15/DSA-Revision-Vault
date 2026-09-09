class Solution {
    public int countCommas(int n) {
        int count =0;
        int s =1000;
        while(n>=s){
            count+=(n-s+1);
            s*=1000;
        }
        return count;
    }
}