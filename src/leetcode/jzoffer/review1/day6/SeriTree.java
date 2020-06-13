package leetcode.jzoffer.review1.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/13     16:52
 */
public class SeriTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    List<Integer> result = new ArrayList<>();
    // Encodes a tree to a single string.

    public String serialize(TreeNode root) {
            if(root==null) return  "";
            ArrayList<TreeNode> list = new ArrayList<>();
            list.add(root);
           goDown(list);
           return
    }
    /**
     * 广度优先搜索
     * @param list 每一层的节点
     */
    public  void goDown(ArrayList<TreeNode> list){
            //终点
            if(list.size()==0){

            }
            ArrayList<TreeNode> next = new ArrayList<>();
            for(TreeNode node : list){
                    if(node!=null){

                    }
            }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

    }
}
