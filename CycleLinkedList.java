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
    public ListNode detectCycle(ListNode head) {
         // 1. 使用快慢指针, 找到快慢指针的交点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // 此时链表就是带环的
                break;
            }
        }
        if (fast == null || fast.next == null) {
            // 链表不带环
            return null;
        }
        // 带环的情况, 设定两个引用, 分别从链表头部和fast slow交点出发, 按照相同的速度同步往后走
        ListNode cur1 = head;
        ListNode cur2 = fast;
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        // 这个位置就是环的入口
        return cur1;
    }
}
