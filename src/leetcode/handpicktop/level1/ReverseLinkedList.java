package leetcode.handpicktop.level1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 反转单链表
 */
public class ReverseLinkedList {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    //思路1：先将链表的值存下来，反向再遍历一次。
    public ListNode reverseList(ListNode head) {
        if(head == null) return  null;
        ArrayList<ListNode>  list = new ArrayList<>();
        while(head!=null){
            list.add(head);
            head = head.next;
        }
        list.get(0).next=null;
        Collections.reverse(list);
        for(int i = 0 ; i < list.size()-1 ; i++){
            ListNode node =  list.get(i);
            node.next = list.get(i+1);
        }
        return  list.get(0);
    }
    //思路2： 额外复制一个链表
    //将 head的node拿过来放在headNew前面，指针指向head之前的下一个
    public ListNode reverseList1(ListNode head) {
        ListNode headNew = null;
        ListNode index = head;
        while(index!=null){
            ListNode temp = index.next; //temp指向下一个

            index.next = headNew;
            headNew = index;

            index = temp;

        }
        return  headNew;
    }

}
