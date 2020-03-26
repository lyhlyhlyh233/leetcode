package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/26     10:18
 */

/**
 * 回文链表
 */

/**
 * 请判断一个链表是否为回文链表。
 */
public class PalindromeLindedList {
    public class ListNode {
      int val;
      ListNode next;
    ListNode(int x) { val = x; }
 }


    public boolean isPalindrome(ListNode head) {
        //    //双指针求链表中点
         ListNode slow = head;
         ListNode fast = head;
         while(fast.next!=null&&fast.next.next!=null){
             slow = slow.next;
             fast = fast.next.next;
         } //slow为前半部分的末尾

        //翻转后半部分链表
       // ListNode temp = slow.next.next;
         ListNode pre = null;
         ListNode cur = slow.next;
         while(cur!=null){
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
         }

         //比较
        ListNode p1 = head;
         ListNode p2 = pre;
         while(p2!=null){
             if(p2.val!=p1.val) return  false;
             p1 = p1.next;
             p2 = p2.next;
         }
         return  true;
    }
}
