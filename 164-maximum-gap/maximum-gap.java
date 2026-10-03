class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
           
            int dif=Math.abs(nums[i]-nums[i-1]);
            if(dif>=max){
                max=dif;
            }
        
        }
      return max;  
    }
}