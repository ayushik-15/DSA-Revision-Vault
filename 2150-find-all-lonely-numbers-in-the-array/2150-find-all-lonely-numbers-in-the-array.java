class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){ 
            boolean found1 = (i==0 || nums[i]-nums[i-1]>1);
            boolean found2 = (i==n-1 || nums[i+1]-nums[i]>1);

            if(found1 && found2){
                result.add(nums[i]);
            }
        }
        return result;
    }
}