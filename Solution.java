import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> solMap = new HashMap<>();
            for (String s : strs) {
                char[] ch = s.toCharArray();ßß
                Arrays.sort(ch);
                String key = String.valueOf(ch);
                if (!solMap.containsKey(key)) {
                    solMap.put(key, new ArrayList<String>());
                }
                solMap.get(key).add(s);
            }
            return new ArrayList<>(solMap.values());
        }
    }
}
