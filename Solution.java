import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('{', '}');

        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (parenthesesMap.containsKey(c)) {
                temp.add(c);
            } else {
                if (temp.isEmpty()) {
                    return false;
                }
                char head = temp.pop();
                if (!parenthesesMap.containsKey(head) || parenthesesMap.get(head) != c) {
                    return false;
                }
            }
        }
        if (!temp.isEmpty()) {
            return false;
        }
        return true;
    }
}