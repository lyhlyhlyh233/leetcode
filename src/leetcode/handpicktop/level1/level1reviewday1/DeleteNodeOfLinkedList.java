package leetcode.handpicktop.level1.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     9:56
 */
public class DeleteNodeOfLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
            //通过移动来删除
          while(node.next.next!=null){//不为最后一个节点的前一个节点
              node.val = node.next.val;
              node = node.next;
          }
          node.val = node.next.val;
          node.next = null;
    }
}
