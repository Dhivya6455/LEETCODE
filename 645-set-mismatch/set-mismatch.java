class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int dup=-1;
        int mis=-1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){    
                dup=nums[i];
                  

            }
            set.add(nums[i]);

        }
        for(int i=1;i<=nums.length;i++){
            if(!(set.contains(i))){
                mis=i;
            }

        }
        
      return new int[]{dup,mis};  
    }
}