class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(s);
        visited.add(s);
        boolean found = false;

        while(!q.isEmpty()){
            String curr = q.poll();
            if(helper(curr)) {
                if(!res.contains(curr)){
                    res.add(curr);
                    found = true;
                }
            }

            if(found) continue;
            for(int i=0; i<curr.length(); i++){
                char c = curr.charAt(i);

                if(c != '(' && c != ')') continue;

                String next = curr.substring(0, i) + curr.substring(i + 1);
                if (!visited.contains(next)) {
                    visited.add(next);
                    q.add(next);
                }
            }
        }
        return res;
    }
    private boolean helper(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '(') count++;
            if(c == ')'){
                count--;
                if(count < 0) return false; 
            }
        }
        return count == 0;
    }
}