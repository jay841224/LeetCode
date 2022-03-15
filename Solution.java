import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sol = new HashSet<>();
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    sol.add(list);
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(sol);
    }
}