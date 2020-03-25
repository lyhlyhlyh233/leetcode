package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/25     10:23
 */

/**
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 */
public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //双指针 快慢指针 慢一次一步，快一次两步
    public boolean hasCycle(ListNode head) {
           if(head == null) return  false;
            ListNode temp1 = head;
            ListNode temp2 = head;
            while(true){
                if(temp2.next==null||temp2.next.next==null) return false;
                temp1 = temp1.next;
                temp2 = temp1.next.next;
                if(temp1.equals(temp2)) return  true;
            }
    }
}
