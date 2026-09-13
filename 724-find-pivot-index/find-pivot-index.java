class Solution {
    public int pivotIndex(int[] nums) {
        
        for( int i=0;i<nums.length;i++){
            int leftsum=0,rightsum=0;
            for(int l=0;l<i;l++){
                leftsum+=nums[l];

            }
             for(int r=i+1;r<nums.length;r++){
                rightsum+=nums[r];

            }
            if(leftsum==rightsum){
                return i;
            }

            
        }
        return -1;
    }
}