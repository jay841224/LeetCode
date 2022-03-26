import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> solList = new ArrayList<>();
        build(n, n, true, "", solList);
        return solList;
    }

    public String build(int left, int right, boolean isLeft, String sol, List<String> solList) {
        if (isLeft && left == 0) {
            return sol;
        }
        if (!isLeft && right == 0) {
            return sol;
        }

        if (right < left) {
            return sol;
        }

        sol += isLeft ? "(" : ")";
        if (isLeft) {
            left--;
        } else {
            right--;
        }

        if (left == 0 && right == 0) {
            solList.add(sol);
        }
        String l = build(left, right, true, sol, solList);
        String r = build(left, right, false, sol, solList);

        return sol;
    }
}