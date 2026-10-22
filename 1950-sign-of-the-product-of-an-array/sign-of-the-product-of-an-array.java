class Solution {
    public int arraySign(int[] nums) {
        int neg=0,pos=0;
        for( int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(nums[i]<0){
                    neg++;
                }
                else{
                    pos++;
                }
            }else{
                return 0;
            }

        }
      if(neg%2!=0) {
        return -1;
      }
      return 1;
    }
}