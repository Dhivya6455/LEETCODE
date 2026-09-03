class Solution { 
    public void duplicateZeros(int[] arr) { 
        int index=0; 
        int arr1[]=new int [arr.length]; 
        for( int i=0;i<arr.length;i++){ 
           if(index <arr.length){ 

            if( arr[i]!=0 ){ 
                 
                arr1[index]=arr[i]; 
                index++;
            } 
            else{ 
                arr1[index]=0; 
                index++;
                if(index <arr.length){ 
                arr1[index]=0;
                index++; 
                }
           
            } } 
         
        } 
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = arr1[i];
        } 
     
        }
}    