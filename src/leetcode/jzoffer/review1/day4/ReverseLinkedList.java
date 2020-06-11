package leetcode.jzoffer.review1.day4;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     10:53
 */
public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode node = head;
            while(node!=null){
                ListNode temp = node.next;
                node.next = pre;
                if(temp == null){
                    return  node;
                }
                node = temp;
            }
            return  null;
    }
}
