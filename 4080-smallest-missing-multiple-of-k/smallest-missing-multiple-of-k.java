class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int mul=k;
        for(int j=0;j<nums.length;j++){

        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mul){
                mul+=k;
            }
        } 
        }
      return mul;  
    }
}