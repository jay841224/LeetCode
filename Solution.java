class Solution {
    public int romanToInt(String s) {
        s += " ";
        int left = 0;
        int right = 1;
        int num = 0;
        while (right < s.length()) {
            switch (s.charAt(left)) {
                case 'I':
                    if ('V' == s.charAt(right) || 'X' == s.charAt(right)) {
                        num -= 1;
                    } else {
                        num++;
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if ('L' == s.charAt(right) || 'C' == s.charAt(right)) {
                        num -= 10;
                    } else {
                        num += 10;
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if ('D' == s.charAt(right) || 'M' == s.charAt(right)) {
                        num -= 100;
                    } else {
                        num += 100;
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
            left++;
            right++;
        }
        return num;
    }
}