public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {//空链表
            return null;
        }
        if(head.next == null) {//只有一个元素
            return head;
        }
        ListNode newHead = null;
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null) {
            ListNode next = cur.next;
            if(next == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return newHead;
    }
}