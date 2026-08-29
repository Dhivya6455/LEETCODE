class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=candies[0];
        List<Boolean> ans=new ArrayList<>();
        
        int arr[]=new int[n];
         for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
         }
        for(int i=0;i<n;i++){
            arr[i]=candies[i]+extraCandies;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]<max){

                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
        return ans;
    }
}