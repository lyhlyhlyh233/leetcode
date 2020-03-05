package leetcode.handpicktop.level1;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 */
public class DeleteNodeInLinkList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    //值前移
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        if(node.next.next==null){
            node.next = null;
            return;
        }
        deleteNode(node.next);
    }

    public static void main(String[] args) {
        DeleteNodeInLinkList deleteNodeInLinkList = new DeleteNodeInLinkList();
        ListNode first = deleteNodeInLinkList.new ListNode(1);
        ListNode second = deleteNodeInLinkList.new ListNode(2);
        ListNode third = deleteNodeInLinkList.new ListNode(3);
        first.next = second;
        second.next = third;
        deleteNodeInLinkList.deleteNode(second);
        System.out.println(first.next.val);
    }
}
