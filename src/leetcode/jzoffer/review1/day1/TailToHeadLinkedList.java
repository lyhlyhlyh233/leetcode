package leetcode.jzoffer.review1.day1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     17:38
 */
public class TailToHeadLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
       //递归法，入栈法，反转法
        public  static  int[] reversePrint(ListNode head) {
                Deque<Integer> stack =  new ArrayDeque<>();
                ListNode point = head;

                while(point!=null){
                    stack.push(point.val);
                    point = point.next;
                }
                int len = stack.size();
                int[] result = new int[stack.size()];
                for(int x = 0; x<len;x++){
                    result[x] = stack.pop();
                }
                return  result;
    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = null;
        reversePrint(a);
    }

}
