class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=0,count =0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count++;//2
            }        }
            for(int x:nums){
                if(x%2==0){
                    arr[n]=x;
                    n++;
                
                }
                else{
                    arr[count] =x;
                    count++;              
                     }
            }
        return arr;
    }
}