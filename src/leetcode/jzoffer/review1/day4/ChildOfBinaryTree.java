package leetcode.jzoffer.review1.day4;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     12:00
 */
public class ChildOfBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  //
    private  boolean isChild(TreeNode A,TreeNode B){
        if(B==null){
            return  true;
        }
        if(A==null){
            return  false;
        }
        if(A.val == B.val){
            return  isChild(A.left,B.left)&&isChild(A.right,B.right);
        }
        else{
            return  false;
        }
    }
  //遍历父数组
  public boolean findFather(TreeNode A,TreeNode B){
        if(A==null){
            return  false;
        }
        //找到可以作为判断的父节点
        if(A.val==B.val){
            if(isChild(A,B)){
                return  true;
            }
        }
        return  findFather(A.left,B)||findFather(A.right,B);
  }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null||A==null) {
            return false;
        }
        return  findFather(A,B);
    }
}
