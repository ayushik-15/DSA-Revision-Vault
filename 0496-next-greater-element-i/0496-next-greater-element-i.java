class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        Stack<Integer> s = new Stack<>();
        int nxt2[] = new int[n2];

        for(int i=n2-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums2[i]){
            s.pop();
            }
            if(s.isEmpty()){
                nxt2[i]= -1;
            }else{
                nxt2[i] = s.peek();
            }
            s.push(nums2[i]);
        }
        int n1 = nums1.length;
        int nxt1[] = new int[n1];

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    nxt1[i] = nxt2[j];
                    break;
                }
            }
        }
        return nxt1;
    }
}