package leetcode.jzoffer.review1.day3;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     13:39
 */

public class DeleteNode {
     //Definition for singly-linked list.
     public class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteNode(ListNode head, int val) {
         ListNode point = head;
         ListNode pre = null;
        while(point!=null){
            if(point.val==val){
                    if(pre==null) {
                        head = point.next;
                    }
                    else{
                        pre.next = point.next;
                    }
                    break;

            }
            else {
                pre = point;
                point= point.next;

            }
        }
        return  head;
    }
}
