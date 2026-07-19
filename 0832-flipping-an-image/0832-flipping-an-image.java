class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n= image.length;
        
        for(int[] row: image){
           int l= 0;
           int r= n-1;
           while(l<=r){
            if(row[l]==row[r]){
                int temp = row[l]^1;
                row[l]=temp;
                row[r]=temp; 
            }
            l++;
            r--;
           }
        }
        return image;
    }
}