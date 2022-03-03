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
// 以三個數字由左至右判斷是否為等差級數
// counter 用來累計不同位置開始的等差級數
// [1, 3, 5, 7, 9]

// [1, 3, 5], [1, 3, 5, 7], [1, 3, 5, 7, 9]
// [3, 5, 7], [3, 5, 7, 9]
// [5, 7, 9]
// 當下一三個數字為等差級數，也代表前面每一層都會多一種燈差級數，因此用counter做累計