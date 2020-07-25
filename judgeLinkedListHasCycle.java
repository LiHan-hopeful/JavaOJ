/*
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {//判断fast.next是否为空，为空直接返回错误
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // 判定两个节点是否是相同节点
                return true;
            }
        }
        return false;
    }
}
