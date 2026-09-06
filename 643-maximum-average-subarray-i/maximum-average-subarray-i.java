class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        double sum =0;
        
            
        
        for(int i=0;i<k;i++){
            sum+=nums[i];
            max=sum;
            
        }
        if(nums.length==k){
            return sum/k;
        }
        else{
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(sum,max);

        }
        }
       return max/k; 
    }
}