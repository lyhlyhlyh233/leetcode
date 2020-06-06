package leetcode.handpicktop.level1.level1reviewday3;

public class PalindromeLinkedLIst {
    public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    //你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
    //将链表反转
    public boolean isPalindrome(ListNode head) {
        if(head == null) return  false;
        ListNode point = head;
        int n = 1;//链表长度
        while(point.next!=null){
            point = point.next;
            n++;
        }
        //前半部分尾节点。中的偏左。
        int mid = n/2;//奇数时在中。
        ListNode pointb = head;
        int count = 1;
        ListNode pre = null;
        while(pointb.next!=null){
            pointb = pointb.next;
            count++;
            if(count==(mid)){//到达终点
                pre = pointb;
            }
            else if(count>mid){
                ListNode next = pointb.next;
                pointb.next = pre;
                pre = pointb;
                pointb = next;
            }
        }
        pointb.next = pre;
        ListNode pointa = head;
        while(pointa.val==pointb.val){
            if(pointa == pointb )return  true;
            pointb = pointb.next;
            pointa = pointa.next;
        }
        return  false;


    }
}
