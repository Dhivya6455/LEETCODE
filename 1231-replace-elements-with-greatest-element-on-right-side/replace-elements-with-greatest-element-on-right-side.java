class Solution {
    public int[] replaceElements(int[] arr) {
        int arr1[]=new int [arr.length];
        arr1[arr.length-1]=-1;
        for( int i=0;i<arr.length-1;i++){
            int g=0;
           for(int j=i+1;j<arr.length;j++){
            if(arr[j]>g){
                g=arr[j];
            }
            

           }
           arr1[i]=g;
        }
      return arr1;  
    }
}