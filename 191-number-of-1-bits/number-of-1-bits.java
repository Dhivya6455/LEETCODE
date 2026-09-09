class Solution {
    public int hammingWeight(int n) {
        int bits=0;
        String binary = Integer.toBinaryString(n);
        for(int i=0;i<binary.length();i++){
            char ch=binary.charAt(i);
            if(ch=='1'){
                bits=bits+1;
            }
        }
        return bits;
    }
}