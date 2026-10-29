class Solution {
    public int numIdenticalPairs(int[] nums) {
        int help[] = new int[101];
        int count =0;
        for(int i: nums){
            count +=help[i];
            help[i]++;
        }
        return count;
    }
}