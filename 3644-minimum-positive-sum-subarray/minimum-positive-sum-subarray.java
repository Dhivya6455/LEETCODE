class Solution {
    public int minimumSumSubarray(List<Integer> arr, int l, int r) {

        int res = Integer.MAX_VALUE;

        Integer[] nums = arr.toArray(new Integer[0]);

        for(int i = 0; i < nums.length; i++) {

            int sum = 0;

            for(int j = i; j < nums.length; j++) {

                sum += nums[j];

                int len = j - i + 1;

                if(len >= l && len <= r && sum > 0) {
                    res = Math.min(res, sum);
                }
            }
        }

        if(res == Integer.MAX_VALUE) {
            return -1;
        }

        return res;
    }
}