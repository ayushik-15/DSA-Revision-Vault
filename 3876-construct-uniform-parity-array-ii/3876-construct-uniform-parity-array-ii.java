class Solution {
    public boolean uniformArray(int[] nums1) {
        if(nums1 == null || nums1.length == 0){
            return true;
        }
        int min = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for(int num:nums1){
            if(num<min){
                min = num;
            }
            if(num%2 !=0){
                hasOdd =true;
            }
        }
        if(min%2 !=0){
            return true;
        }
        return !hasOdd;
    }
}