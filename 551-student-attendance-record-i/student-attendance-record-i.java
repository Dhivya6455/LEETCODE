class Solution {
    public boolean checkRecord(String s) {
        char arr[]=s.toCharArray();
        int count=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]=='L'){
            if(arr[i-1]==arr[i] && arr[i]==arr[i+1]){
                return false;

            }
        }
        }
             for(int i=0;i<arr.length;i++){
              if(arr[i]=='A'){
                count++;

            }
            
        }
        if(count>1){
            return false;
        }
        return true;
    }
}