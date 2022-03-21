
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        countBack(newHead, n);
        return newHead.next;

    }

    public int countBack(ListNode head, int n) {
        if (head.next == null) {
            return 1;
        }

        int a = countBack(head.next, n);

        if (a == n) {
            head.next = head.next.next;
        }
        return a + 1;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}