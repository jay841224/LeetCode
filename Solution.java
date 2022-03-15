class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 1;
        String same = strs[0];
        while (index < strs.length) {
            same = compare(same, strs[index]);
            index++;
        }
        return same;
    }

    public String compare(String s1, String s2) {
        int index = 0;
        while (index < s1.length() && index < s2.length() && (s1.charAt(index) == s2.charAt(index))) {
            index++;
        }
        return s1.substring(0, index);
    }
}