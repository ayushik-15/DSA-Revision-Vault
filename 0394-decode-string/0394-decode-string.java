class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st2 = new Stack<>();
        StringBuilder str = new StringBuilder();
        int k = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }else if(ch == '['){
                st.push(k);
                st2.push(str); 
                str = new StringBuilder();
                k = 0;
            }else if(ch == ']'){
                StringBuilder prev = st2.pop();
                int r = st.pop();
                for(int i= 0; i<r; i++){
                    prev.append(str);
                }
                str = prev; 
            }else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}