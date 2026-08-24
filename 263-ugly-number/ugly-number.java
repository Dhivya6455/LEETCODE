class Solution {
    public boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }

        for (int i = 2; i <= 5; i++) {
            while (i != 4 && n % i == 0) {
                n = n / i;
            }
        }

        return n == 1;
    }
}
