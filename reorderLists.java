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
public class Solution {

    public void reorderList(ListNode head) {
        if (head==null)
            return;
        ListNode middle=findMiddle(head);
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;
        right=reverseList(right);
        merge(left,right);
    }

    private void merge(ListNode left, ListNode right) {
        while (right!=null){
            ListNode tmp=right.next;
            right.next=left.next;
            left.next=right;
            left=right.next;
            right=tmp;
        }
    }

   
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur=null;
        ListNode pre=head;

        while (pre!=null){
            ListNode tmp=pre.next;
            pre.next=cur;
            cur=pre;
            pre=tmp;
        }
        return cur;
    }
}


