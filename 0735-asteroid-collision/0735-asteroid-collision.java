class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int ast:asteroids){
            boolean found = false;

            while(!st.isEmpty() && ast < 0 && st.peek() > 0){
                if(st.peek() < -ast){
                    st.pop(); 
                }else if(st.peek() == -ast){
                    st.pop(); 
                    found = true;
                    break;
                }else{
                    found = true;
                    break;
                }
            }
            if(!found){
                st.push(ast);
            }
        }
        int[] res = new int[st.size()];
        for(int i=res.length-1; i >= 0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}