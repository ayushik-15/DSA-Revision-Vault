class Solution {
    public boolean predictTheWinner(int[] nums) {
        if( helper(nums,0,nums.length-1)>=0)return true;
        return false;
    }
    private int helper(int[] nums, int i,int j){
        if(i==j){
            return nums[i];
        }
        int P1 = nums[i] - helper(nums,i+1,j);
        int P2 = nums[j] - helper(nums,i,j-1);

        int more = Math.max(P1,P2);

        return more;
    }
}