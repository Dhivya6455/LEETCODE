class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[]=new int[nums.length+nums.length];
        
        int j=nums.length-1;
        for(int i=0;i<ans.length;i++){
            if(i<nums.length){
                ans[i]=nums[i];
            }
            else{
            ans[i]=nums[j];
            j--;
            }
        }
      return ans;  
    }
}