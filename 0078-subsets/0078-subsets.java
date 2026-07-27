class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void helper(int[] nums, int i, List<Integer> curr, List<List<Integer>> result){
        if(i == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);                  
        helper(nums, i + 1, curr, result);   
        curr.remove(curr.size() - 1);       

        helper(nums, i + 1, curr, result);  
    }
}