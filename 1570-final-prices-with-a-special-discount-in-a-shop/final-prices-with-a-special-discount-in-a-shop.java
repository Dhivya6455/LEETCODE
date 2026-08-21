class Solution {
    public int[] finalPrices(int[] p) {
        int ans[]=new int[p.length];
        ans[p.length-1]=p[p.length-1];
        for(int i=0;i<p.length;i++){
            for(int j=i+1;j<p.length;j++){
            if(p[i]>=p[j]){
                ans[i]=p[i]-p[j];
                break;

            }  
            else{
                ans[i]=p[i];
            }
        }  
        } 
        return ans;     
    }
}