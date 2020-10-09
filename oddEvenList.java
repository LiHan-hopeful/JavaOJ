/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
      if (head == null){
          return null;
      } 
        ListNode odd = head;
        ListNode Head = head.next;
        ListNode newHead = Head;
        while (Head != null && Head.next != null) {
            odd.next = Head.next;
            odd = odd.next;
            Head.next = odd.next;
            Head = Head.next;
        }
        odd.next = newHead;
        return head;

    }
}
