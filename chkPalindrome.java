public class LinkedListTest {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
     public boolean chkPalindrome(ListNode A) {
        int size = size(A);
        int steps = size / 2;
        ListNode B = A;
        for (int i = 0; i < steps; i++) {
            B = B.next;
        }
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                B = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        while (B != null) {
            if (A.val != B.val) {
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }
}