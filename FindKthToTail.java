public class LinkedListTest {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int size = size(head);
        if (k <= 0 || k > size) {
            return null;
        }
        int steps = size - k;
        ListNode cur = head;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        return cur;
    }
}