/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return null;
        
        ListNode curNode = head;
        while(curNode.next != null){
            if(curNode.next.val < x){
                ListNode tmp = curNode.next;
                curNode.next = curNode.next.next;
                tmp.next = head;
                head = tmp;
            }
            else
                curNode = curNode.next;
        }
        
        return head;
    }
}

