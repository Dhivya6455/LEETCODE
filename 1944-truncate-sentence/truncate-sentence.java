class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.trim().split(" ");
        String str1="";
        for( int i=0;i<k;i++){
            str1+=str[i]+" " ;

        }
        return str1.trim();
    }
}