class Solution {
    public boolean checkIfPangram(String sentence) {
       sentence=sentence.toLowerCase();
       
       for(int i=97;i<123;i++){
        if(sentence.indexOf((char)i) == -1){
            return false;
        }
        
       }
        return true;
    }
}