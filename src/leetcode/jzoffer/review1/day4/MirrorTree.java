package leetcode.jzoffer.review1.day4;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     14:48
 */
public class MirrorTree {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }

    /**
     * 返回root的镜像树
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) {
            return  null;
        }
        TreeNode result = root;
        result.left = mirrorTree(root.right);
        result.right = mirrorTree(root.left);
        return  result;
    }
}
