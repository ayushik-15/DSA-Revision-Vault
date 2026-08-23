class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        for(int i=n;i!=0;i/=10){
            int t=i%10;
            sum+=t;
            p*=t;
        }
        if(n%(sum+p)==0)return true;
        return false;
    }
}