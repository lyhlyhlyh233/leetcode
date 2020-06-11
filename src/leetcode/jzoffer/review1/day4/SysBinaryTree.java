package leetcode.jzoffer.review1.day4;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     17:07
 */
public class SysBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    private  boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return  true;
        }
        else if(left==null||right==null){
            return  false;
        }
        else if(left.val!=right.val) {
            return  false;
        }
        else if(left.val == right.val){
            return  isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
        }
        return  false;
    }

    public boolean isSymmetric(TreeNode root) {
            if(root == null) {
                return true;
            }
            return  isSymmetric(root.left,root.right);
    }
}
