import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
       if(pHead==null || pHead.next==null) {
           return pHead;
       }
        ListNode maxHead = new ListNode(1);
        ListNode minHead = new ListNode(0);
        ListNode posMax = maxHead;
        ListNode posMin = minHead;
           while(pHead!=null) {
                while(pHead!=null&&pHead.val<x) {
                        posMin.next = pHead;  
                        posMin = posMin.next;
                        pHead = pHead.next;
                        posMin.next = null;
                    }
                while(pHead!=null&&pHead.val>=x) {
                        posMax.next = pHead;
                        posMax = posMax.next;
                        pHead = pHead.next;
                        posMax.next = null;
                    }
            }
            if(minHead.next==null){
                return    maxHead.next;
            }
            if(maxHead.next!=null){
                 posMin.next = maxHead.next;
            }
             return minHead.next;  
    }
}