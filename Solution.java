class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int right = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = startFromMid(i, i, s);
            int length2 = startFromMid(i, i + 1, s);
            int tempMax = Math.max(length1, length2);
            if (max < tempMax) {
                max = tempMax;
                left = i - (max - 1) / 2;
                right = i + max / 2;
            }
        }
       return s.substring(left, right + 1);
    }
    
    public int startFromMid(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
