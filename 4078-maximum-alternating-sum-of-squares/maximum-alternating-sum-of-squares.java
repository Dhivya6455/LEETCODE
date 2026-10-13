import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(arr);

        long sum = 0;
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            sum += arr[e];
            sum -= arr[s];

            s++;
            e--;
        }

        if (s == e) {
            sum += arr[s];
        }

        return sum;
    }
}