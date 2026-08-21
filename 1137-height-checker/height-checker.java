class Solution {
    public int heightChecker(int[] h) {
        int count=0;
        int ans[]=new int[h.length];
        for(int i=0;i<h.length;i++){
            ans[i]=h[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<h.length;i++){
            if(h[i]!=ans[i]){
                count++;
            }
        }
      return count;  
    }
}