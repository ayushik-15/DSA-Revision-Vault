class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;

        while(true){
            int temp = num;
            int pro =1;

            while(temp>0){
                int d =temp%10;
                pro*=d;
                temp/=10;
            }
            if(pro%t==0){
            return num;
           }
           num++;
        }
    }
}