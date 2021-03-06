package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/13     10:34
 */
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        //递归
        if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return  l1;
        }
        else{
            l2.next = mergeTwoLists(l1,l2.next);
            return  l2;
        }

    }
}
