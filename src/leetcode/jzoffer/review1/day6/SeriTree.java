package leetcode.jzoffer.review1.day6;

import java.util.*;

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
   // List<Integer> result = new ArrayList<>();
    StringBuffer result = new StringBuffer();
    // Encodes a tree to a single string.

    public String serialize(TreeNode root) {
            if(root==null)  return  "";
            ArrayList<TreeNode> list = new ArrayList<>();
            result.append("[");
            list.add(root);
           goDown(list);
           if(result.toString().length()>1){
               result.deleteCharAt(result.toString().length()-1);
           }
           result.append("]");
           return result.toString();
    }
    /**
     * 广度优先搜索
     * @param list 每一层的节点,含null值。result : 所有结果。
     */
    public  void goDown(ArrayList<TreeNode> list){
        //终点

        if(list.size()==0){
            return;
        }
        ArrayList<TreeNode> next = new ArrayList<>();
        for(TreeNode node : list){

            if(node!=null){
                result.append(node.val+",");
                next.add(node.left);
                next.add(node.right);
            }
            else{
                result.append("null"+",");
            }
        }
        goDown(next);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{ add(root); }};
        int i = 1;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if(!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;

    }
}
