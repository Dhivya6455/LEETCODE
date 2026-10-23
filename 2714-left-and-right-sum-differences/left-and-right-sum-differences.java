
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];

        for (int i = 0; i < n - 1; i++) {
            left[i + 1] = nums[i] + left[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] + right[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }

        return ans;
    }
}
