package leetcode.handpicktop.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     10:39
 */
public class ReverseLinkedList {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
            if(head == null) return null;
            ListNode pre = null;
            ListNode next = null;
            while(head.next!=null){//不为最后一个节点时
                next = head.next;//将正序的next存下来
                head.next = pre;//反指
                pre = head;//为下次循环的pre做准备
                head = next;//下次循环，head右移
            }
            //最后一个几点 head
            head.next=pre;
            return  head;
    }
}
