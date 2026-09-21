class Solution {
    public int[][] flipAndInvertImage(int[][] mat) {
         
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int [n][m];
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=m-1;j>=0;j--){
            
              if(mat[i][j]==1){
                ans[i][k]=0;
                k++;
              }
              else{
                ans[i][k]=1;
                k++;
              }
              
               
            }
        }
        return ans;
          
    }
}