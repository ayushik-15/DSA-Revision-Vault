class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>(); 

        for(int i=2*n-1; i>=0; i--){
            int curr = i%n;
            while(!s.isEmpty() && nums[s.peek()] <= nums[curr]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[curr] = -1;
            }else{
                ans[curr]= nums[s.peek()];
            }
            s.push(curr);
        }
        return ans;
    }
}