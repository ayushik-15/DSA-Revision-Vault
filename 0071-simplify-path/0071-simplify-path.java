class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String str[] = path.split("/");

         for(int i=0;i<str.length;i++){
            String st = str[i];

            if(st.equals("") || st.equals(".")){
                continue;
            }else if(st.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(st);
            }
        } 
        StringBuilder sb = new StringBuilder();
        for(String st : s) {
            sb.append("/").append(st);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}