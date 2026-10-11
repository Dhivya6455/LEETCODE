class Solution {
    public String reversePrefix(String word, char ch) {
        int index=0;
        String s="";
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                index=i;
                break;

            }
        }
        for(int i=index;i>=0;i--){
           s+=word.charAt(i); 

        }
        for(int i=index+1;i<word.length();i++){
            s+=word.charAt(i); 
            
        }
        return s;
    }
}