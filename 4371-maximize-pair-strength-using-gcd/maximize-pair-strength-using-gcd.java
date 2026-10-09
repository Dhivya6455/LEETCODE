class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
            long a=  (long)nums[i] * nums[j];
            long b=  (long)gcd(nums[i], nums[j]);
            max=Math.max(max,a/(b*b));
            } 
        }        
       return max; 
    }
    public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    return a;

		}

}