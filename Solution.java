class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> storeMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ss = s.charAt(i);
            if (storeMap.containsKey(ss)) {
                max = storeMap.keySet().size() > max ? storeMap.keySet().size() : max;
                i = storeMap.get(ss);
                storeMap.clear();
            } else {
                storeMap.put(ss, i);
            }
        }
        return max = storeMap.keySet().size() > max ? storeMap.keySet().size() : max;
    }
}