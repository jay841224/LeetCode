import java.util.ArrayList;
import java.util.List;

class Solution {

    private final String[] keys = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> sol = new ArrayList<>();
        findAll(digits, 0, 0, "", sol);
        return sol;
    }

    public String findAll(String digits, int di, int ki, String str, List<String> sol) {
        if (digits.length() == 0) {
            return null;
        }

        if (digits.length() - 1 < di) {
            sol.add(str);
            return null;
        }
        String digitStr = keys[Integer.parseInt(String.valueOf(digits.charAt(di)))];
        if (digitStr.length() - 1 < ki) {
            return null;
        }
        str += String.valueOf(digitStr.charAt(ki));
        findAll(digits, ++di, 0, str, sol);
        findAll(digits, --di, ++ki, str.substring(0, str.length() - 1), sol);
        return null;
    }
}
// abc def
// 思路是先將a走完，再走完b，再走完c