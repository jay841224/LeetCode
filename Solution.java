class Solution {
    // Arithmetic Slices
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int solution = 0;
        int counter = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                counter++;
                solution += counter;
            } else {
                counter = 0;
            }
        }
        return solution;
    }
}