package note.ArrayAndList;

public class Solution {

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

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        // slow 一次走一格，fast 一次走兩格(slow的兩倍速度)，所以 fast 到終點時，slow 會是中間點
        // 於是就拆成兩個
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 中間點的下一個當作另一個頭繼續拆
        ListNode head2 = slow.next;
        // 把中間點訂為結束點
        slow.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(head2);
        return mergeAndSort(l1, l2);
    }

    // 排序並合併
    ListNode mergeAndSort(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode merger = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                merger.next = l1;
                l1 = l1.next;
            } else {
                merger.next = l2;
                l2 = l2.next;
            }
            merger = merger.next;
        }
        if (l1 == null) {
            merger.next = l2;
        } else {
            merger.next = l1;
        }
        return head.next;
    }
}
