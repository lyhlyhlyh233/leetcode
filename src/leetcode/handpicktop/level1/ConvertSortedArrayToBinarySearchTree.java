package leetcode.handpicktop.level1;


/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */
public class ConvertSortedArrayToBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return  build(nums,0,nums.length-1);
    }
    //构造子树
    public TreeNode build(int[] nums, int left, int right) {
        if(left>right) return  null;
        int mid =left + (right - left + 1) / 2;  //靠右就行 why？

        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums,left,mid-1);
        root.right = build(nums,mid+1,right);
        return root;
    }
}
