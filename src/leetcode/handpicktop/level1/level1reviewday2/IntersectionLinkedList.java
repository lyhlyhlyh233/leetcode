package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     14:19
 */
public class IntersectionLinkedList {
      public class ListNode {
          int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    //双指针，换路
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          if(headA==null||headB==null) return  null;
            ListNode pointA =headA;
            ListNode pointB = headB;
            int count = 0;
            while(count<2){
                if(pointA==pointB) return  pointA;
                if(pointA.next==null){
                    pointA = headB;
                    count++;
                }
                else{
                    pointA = pointA.next;
                }
                if(pointB.next==null){
                    pointB = headA;
                }
                else{
                    pointB = pointB.next;
                }
            }
            return  null;
    }
}
