public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next ==null){
            return head;
        }
        int steps = getSize(head) / 2 ;
        ListNode cur = head;
        for(int i = 0; i < steps; i++){
            cur = cur.next;
        }
        return cur;
    }

    private int getSize(ListNode head) {
        int size = 0;
        for(ListNode cur = head; cur != null; cur= cur.next){
            size++;
        }
        return size;
    }
}
