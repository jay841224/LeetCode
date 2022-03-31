class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = -1;
        int right = -1;

        int fl = 0;
        int fr = nums.length - 1;
        while (fl <= fr) {
            int mid = (fl + fr) / 2;
            if (nums[mid] < target) {
                fl = mid + 1;
            } else if (nums[mid] > target) {
                fr = mid - 1;
            } else {
                right = mid;
                fl = mid + 1;
            }

        }

        int ll = 0;
        int lr = nums.length - 1;
        while (ll <= lr) {
            int mid = (ll + lr) / 2;
            if (nums[mid] > target) {
                lr = mid - 1;
            } else if (nums[mid] < target) {
                ll = mid + 1;
            } else {
                left = mid;
                lr = mid - 1;
            }

        }

        return new int[] { left, right };
    }
}