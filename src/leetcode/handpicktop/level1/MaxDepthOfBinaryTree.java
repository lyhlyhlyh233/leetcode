package leetcode.handpicktop.level1;

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MaxDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    //递归
    public int maxDepth(TreeNode root) {
        if(root==null) return  0;
        return  Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
