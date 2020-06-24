import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
         ListNode list = new ListNode(-1);
            ListNode head = list;
            ListNode p = a;
            ListNode q = b;
            int sum = 0;
            if(a == null){
                return b;
            }
            if(b==null){
                return a;
            }
            while(p != null || q != null || sum !=0){
                if(p!=null){
                    sum += p.val;
                    p = p.next;
                }
                if(q!=null){
                    sum += q.val;
                    q = q.next;
                }
                head.next = new ListNode(sum%10);
                sum /= 10;
                head = head.next;
            }
            return list.next;
    }
}