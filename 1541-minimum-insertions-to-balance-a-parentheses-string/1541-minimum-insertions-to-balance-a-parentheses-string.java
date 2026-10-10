class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int b = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(c == '('){
                st.push(c);
            }else{ 
                if(i+1 < n && s.charAt(i+1) == ')'){
                    i++; 
                }else{
                    b++;
                }
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    b++;
                }
            }
        }
        b += st.size()*2;
        return b;
    }
}