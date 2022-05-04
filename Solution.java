class Solution {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if (cur + n < n) {
                cur = n;
            } else {
                cur += n;
            }

            if (max < cur) {
                max = cur;
            }

        }
        return max;
    }
}