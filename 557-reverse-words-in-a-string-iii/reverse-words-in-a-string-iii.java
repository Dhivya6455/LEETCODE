class Solution {
    public String reverseWords(String s) {
        String a="";
        String b="";
        String str[]=s.trim().split(" ");
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                 char ch=str[i].charAt(j);
                
                 a=a+ch;
                
            }
         
        a=a+" ";
        }
       b+=a;
       return  b.trim();
    }
}