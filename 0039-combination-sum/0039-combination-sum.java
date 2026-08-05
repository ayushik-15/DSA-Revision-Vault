class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void helper(int[] candidates, int remain, int start, List<Integer> curr, List<List<Integer>> result){
        if(remain == 0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(remain < 0){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            curr.add(candidates[i]);
            helper(candidates, remain - candidates[i], i, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
    