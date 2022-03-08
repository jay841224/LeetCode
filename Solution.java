
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        if (head == head.next) {
            return true;
        }

        ListNode nextHead = head.next;
        head.next = head;
        boolean isCycle = hasCycle(nextHead);

        return isCycle;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// 每經過一個node，就將該node的next指向自己，之後只要遇到next指向自己的node，就代表有cycle