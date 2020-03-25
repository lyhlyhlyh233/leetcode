package leetcode.handpicktop.level1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/23     10:26
 * 编写一个程序，找到两个单链表相交的起始节点。
 * 相交一定是y型的
 */
public class IntersectionOfTwoLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //利用Hash表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa = headA;
        ListNode tempb = headB;
        HashSet<ListNode> hashSet = new HashSet<>();
        while (tempa!=null){
                hashSet.add(tempa);
                tempa = tempa.next;
        }
        while(tempb!=null){
                if(hashSet.contains(tempb)) return  tempb;
                tempb = tempb.next;
        }
        return  null;
    }
    //双指针 a+toge+b b+toge+a相遇在交点
    public ListNode getNode(ListNode headA,ListNode headB){
        ListNode tempa = headA;
        ListNode tempb = headB;
        while(tempa!=tempb){//重新定位而不是改变next

            }
            if(tempa==tempb) return  tempa;
            else return  null;

    }

}
