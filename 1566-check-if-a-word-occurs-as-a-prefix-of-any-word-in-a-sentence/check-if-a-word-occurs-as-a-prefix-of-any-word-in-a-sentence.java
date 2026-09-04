class Solution {
    public int isPrefixOfWord(String s, String searchWord) {
       String[] word= s.trim().split(" ");
       int a=-1;
     for(int i=0;i<word.length;i++){
        if(word[i].startsWith(searchWord)){
            a=i+1;
            break;

        }
        }
       
       
       return a;
    }
}