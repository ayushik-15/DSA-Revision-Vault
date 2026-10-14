class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9 * num){
            return "";
        }
        
        StringBuilder str = new StringBuilder();
        
        int n = sum/9;
        for(int i=0; i<n; i++){
            str.append('9');
        }
        int rem = sum % 9;
        if (rem > 0) {
            str.append(rem);
        }
        while(str.length() < num) {
            str.append('0');
        }
        return str.toString();
    }
}