class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int odd=0;
        int even=0;
        for(int i=1;i<=n;i++){
            even+=i*2; 
            odd+=i*2-1;     
            }
            
        
      int max=1;
      int j=Math.max(odd,even);
      while(j>0){
        if(odd%j==0 && even%j==0) {
					max=Math.max(j, max);
				}
			j--;	
      }  
      return max;
    }
}