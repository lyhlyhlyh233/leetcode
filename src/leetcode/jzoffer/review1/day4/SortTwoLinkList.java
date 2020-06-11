package leetcode.jzoffer.review1.day4;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     11:19
 */
public class SortTwoLinkList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1==null){
                return  l2;
            }
            if(l2 == null){
                return  l1;
            }
        ListNode l ;
        if(l1.val<l2.val){
                l= new ListNode(l1.val);
                l.next = mergeTwoLists(l1.next,l2);
        }else{
            l= new ListNode(l2.val);
            l.next = mergeTwoLists(l1,l2.next);
        }
        return  l;
    }
}
