class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode myHead = new ListNode(0);
        ListNode  p = l1;
        ListNode  q = l2;
        ListNode  cur = myHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return myHead.next;
    }
}

