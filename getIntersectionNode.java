public class LinkedListTest {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
      public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = size(headA);
        int size2 = size(headB);
        if (size1 > size2) {
            int offSet = size1 - size2;
            for (int i = 0; i < offSet; i++) {
                headA = headA.next;
            }
        } else {
            int offSet = size2 - size1;
            for (int i = 0; i < offSet; i++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}