package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/24     14:23
 */

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public  boolean isEqual(TreeNode left,TreeNode right){
        if(left==null&&right==null) return  true;
        if(left==null||right==null) return  false;
        if(left.val!=right.val) return  false;
        boolean isOut = isEqual(left.left,right.right);
        boolean isIn = isEqual(left.right,right.left);
        return  isOut&&isIn;
    }
    public boolean isSymmetric(TreeNode root) {
         if(root == null) return  true;
         return  isEqual(root.left,root.right);
    }
}
