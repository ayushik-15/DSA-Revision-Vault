class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean found1 = true;
        boolean found2 = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                found1 = false;
            }
            if(nums[i]>nums[i+1]){
                found2 = false;
            }
            if(!found1 && !found2){
                return false;
            }
        }
        return found1 || found2;
    }
}