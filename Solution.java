import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solList = new ArrayList<>();
        boolean[] checked = new boolean[nums.length];
        List<Integer> curList = new ArrayList<>();
        backtraing(solList, curList, nums, checked);
        return solList;
    }

    public void backtraing(List<List<Integer>> solList, List<Integer> curList, int[] nums, boolean[] checked) {

        if (curList.size() == nums.length) {
            solList.add(new ArrayList<>(curList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!checked[i]) {
                curList.add(nums[i]);
                checked[i] = true;
                backtraing(solList, curList, nums, checked);
                curList.remove(curList.size() - 1);
                checked[i] = false;
            }
        }
    }
}