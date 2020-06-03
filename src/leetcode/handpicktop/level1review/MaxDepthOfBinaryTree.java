package leetcode.handpicktop.level1review;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     10:09
 */
public class MaxDepthOfBinaryTree {
    public class TreeNode {
       int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
    /**
     *
     * @param head
     * @param n  n为包含 head的深度
     * @return
     */
   public int findDepth(TreeNode head , int n){
            if(head.left == null && head.right == null) return  n;
            else if(head.left == null) return  findDepth(head.right,n+1);
            else if(head.right == null) return  findDepth(head.left,n+1);
            else return  Math.max(findDepth(head.left,n+1),findDepth(head.right,n+1));
   }
    public int maxDepth(TreeNode root) {
            if(root == null ) return  0;
            return  findDepth(root,1);
    }
}
