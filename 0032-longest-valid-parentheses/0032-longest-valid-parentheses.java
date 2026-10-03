class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> sc = new Stack<>();
        sc.push(-1); 
        int m = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                sc.push(i);
            }else{
                sc.pop();
                
                if(sc.isEmpty()){
                    sc.push(i);
                }else{
                    m = Math.max(m, i - sc.peek());
                }
            }
        }
        return m;
    }
}