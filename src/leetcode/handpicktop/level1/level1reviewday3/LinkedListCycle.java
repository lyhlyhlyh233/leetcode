package leetcode.handpicktop.level1.level1reviewday3;

public class LinkedListCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    //判断链表是否有环  //快慢指针
    public boolean hasCycle(ListNode head) {
        if(head==null) return  false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
             fast = fast.next.next;
             slow = slow.next;
             if(fast == slow ) return  true;
        }
        return  false;
    }
}
