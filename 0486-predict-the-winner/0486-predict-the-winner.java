class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        Integer[][] arr = new Integer[n][n];
        return helper(nums,0,nums.length-1,arr)>=0;
    }
    private int helper(int[] nums, int i,int j,Integer[][] arr){
        if(i==j){
            return nums[i];
        }
        if(arr[i][j] !=null ){
            return arr[i][j];
        }
        int P1 = nums[i] - helper(nums,i+1,j,arr);
        int P2 = nums[j] - helper(nums,i,j-1,arr);

        return arr[i][j] = Math.max(P1,P2);
    }
}