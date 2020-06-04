package leetcode.handpicktop.level1.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     10:17
 */
public class TransSortedLinkedListToBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode Trans(int[] nums,int begin,int end){
        if(begin>end) return  null;
        int mid =begin+(end-begin+1)/2;//中点偏右
        TreeNode node = new TreeNode(nums[mid]);
        node.left = Trans(nums,begin,mid-1);
        node.right = Trans(nums,mid+1,end);
        return  node;
    }
    //将有序数组转换为高度平衡的二叉搜索树（左边小，右边大）
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0 ) return null;
        return  Trans(nums,0,nums.length-1);
    }
}
