class Solution {
    public String defangIPaddr(String address) {
        if(address.length()==0){
            return "";
        }
        char first = address.charAt(0);
        String rest = defangIPaddr(address.substring(1));
        
        if(first == '.'){
            return "[.]"+rest;
        }else{
            return first +rest;
        }
    }
}