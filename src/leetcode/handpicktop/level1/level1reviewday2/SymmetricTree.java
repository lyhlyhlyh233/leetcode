package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     15:40
 */
public class SymmetricTree {
    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean isS(TreeNode left, TreeNode right){
        if(left==null&&right!=null) return  false;
        if(right==null&&left!=null) return  false;
        if(left==null&&right==null) return  true;
        if(left.val!=right.val) return  false;
        return  isS(left.right,right.left)&&isS(left.left,right.right);

    }
    public boolean isSymmetric(TreeNode root) {
           if(root==null) return  true;
            //判断左右子树是否对称
            return  isS(root.left,root.right);
    }
}
