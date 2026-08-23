class Solution {
    public boolean checkDivisibility(int n) {
        int num =n;
        int sum =0;
        int pro =1;
        while(n>0){
            int d = n%10;
            sum+=d;
            pro*=d;
            n/=10;
        }
        int add = sum+pro;
        if(num%add==0){
            return true;
        }
        return false;
    }
}