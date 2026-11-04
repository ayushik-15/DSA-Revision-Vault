class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        int n = nums[nums.length-1];

        for(int i=0;i<nums.length;i++){
            count+= (n-nums[i]);
        }
        return count;
    }
}