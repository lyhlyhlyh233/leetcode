package leetcode.jzoffer.review1.day3;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     17:52
 */
public class KInLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while(fast!=null){
            if(count >= k){
                slow = slow.next;
            }
            fast = fast.next;
            count++;
        }
        return  slow;
    }
}
