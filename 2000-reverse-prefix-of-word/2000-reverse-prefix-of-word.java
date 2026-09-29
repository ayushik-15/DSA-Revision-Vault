class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        
        if(idx == -1){
            return word;
        }

        char[] chars = word.toCharArray();
        int left = 0, right = idx;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}