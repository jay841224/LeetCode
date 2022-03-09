public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0, head);
        // 建立一個 preHead 等待檢查有無重複
        ListNode preHead = newHead;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // 重複的都經過後替換掉 preHead 的 next，就會跳過重複的 node 了
                preHead.next = head.next;
            } else {
                preHead = preHead.next;
            }
            head = head.next;
        }
        return newHead.next;
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