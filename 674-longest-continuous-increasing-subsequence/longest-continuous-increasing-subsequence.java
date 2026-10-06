class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int i=1;
        int count=1;
        int max=1;
        if(nums.length==1){
            return 1;
        }
        while(i<nums.length){
            if(nums[i]>nums[i-1]){
                count++;
            
            }
            else{
                count=1;
            }
            i++;
            max=Math.max(max,count);
        }
       return max; 
    }
}