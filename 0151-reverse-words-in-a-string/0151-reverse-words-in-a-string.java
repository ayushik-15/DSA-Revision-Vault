class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        Stack<String> st = new Stack<>();

        for(String word : words){
            st.push(word);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
            if(!st.isEmpty()){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}