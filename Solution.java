import java.util.ArrayList;
import java.util.Arrays;
        va.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

        Set<List<Integer>> sol = new HashSet<>();
        if (nums == null || nums.length < 4) {
            return new ArrayList(sol);
        }
        int startIndex = 0;


               threeSum(nums, startIndex, sol, target);
            startIndex++;
        }
        return new ArrayList(sol);
    }

    public List<List<Integer>> threeSum(int[] nums, int si, Set<List<Integer>> sol, int target) {

        Arrays.sort(nums);
        for (int i = si + 1; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k] + nums[si];
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[si]);
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