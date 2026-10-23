class Solution {
    public int differenceOfSum(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            x+=nums[i];
           int  n=nums[i];
            while(n>0){
                int digit=n%10;
                y+=digit;
                n/=10;

            }
        }
    
        return Math.abs(x-y);
    }
}