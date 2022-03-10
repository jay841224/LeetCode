import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int n : nums) {
            if (map.containsKey(target - n)) {
                sol[0] = map.get(target - n);
                sol[1] = index;
                break;
            }
            map.put(n, index);
            index++;
        }
        return sol;
    }
}
