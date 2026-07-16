class Solution {
    public boolean isIdealPermutation(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }
    private int helper1(int[] nums,int si,int ei){
        if(si>=ei){
            return 0;
        }
        int mid= si+(ei-si)/2;
        int left =helper1(nums,si,mid);
        int right =helper1(nums,mid+1,ei);
        int merge =helper2(nums,si,mid,ei);

        return left+right+merge;
    }
    private int helper2(int[] nums,int si,int mid,int ei){
        int[] temp = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int count =0;

        while(i<=mid && j<=ei){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
                count+= mid-i+1;
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=ei){
            temp[k++]=nums[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }
        return count;
    }
}