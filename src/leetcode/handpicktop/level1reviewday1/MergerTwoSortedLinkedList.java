package leetcode.handpicktop.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     14:43
 */
public class MergerTwoSortedLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      //合并两个升序链表   //归并
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          ListNode result = null;
          if(l1 == null  ) return  l2;
          if(l2 == null )  return  l1;
          if(l1.val<=l2.val){
              result = l1;
              result.next = mergeTwoLists(l1.next,l2);
          }
          else{
                result = l2;
                result.next = mergeTwoLists(l1,l2.next);
          }
          return  result;
    }

    }
}
