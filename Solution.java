public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head  = new ListNode(0);
        ListNode tempHead = head;
        int add = 0;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a + b + add;
            add = sum / 10;
            tempHead.next = new ListNode(sum % 10);
            tempHead = tempHead.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        tempHead.next = add == 0 ? null : new ListNode(add);
        return head.next;
    }
}
