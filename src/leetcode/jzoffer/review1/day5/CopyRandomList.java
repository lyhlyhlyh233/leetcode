package leetcode.jzoffer.review1.day5;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/12     16:34
 */
public class CopyRandomList {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    //图的
    //深度优先搜索与广度优先搜索
    //用一个map来表示复制关系，判断是否已经复制
    public Node copyRandomList(Node head) {
            HashMap<Node,Node> map = new HashMap<>();
            return  dfs(head,map);
    }
    public Node dfs(Node node,HashMap<Node,Node> map){
           if(node == null){
               return  null;
           }
           if(map.containsKey(node)){
               return  map.get(node);
           }
           Node copy = new Node(node.val);
           map.put(node,copy);
           copy.next = dfs(node.next,map);
           copy.random = dfs(node.random,map);
           return  copy;
    }

}
