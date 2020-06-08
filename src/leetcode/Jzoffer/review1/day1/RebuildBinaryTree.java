package leetcode.Jzoffer.review1.day1;

import java.util.HashMap;

public class RebuildBinaryTree {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    //输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    //前序，中序   对root而言
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0) return  null;
        HashMap<Integer,Integer> inMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < preorder.length ; i++){
            inMap.put(inorder[i],i);
        }
        //TreeNode root = new TreeNode(preorder[0]);
        return  go(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);

    }
    public TreeNode go(int[] preorder,int prefrom,int preto,int[] inorder,int infrom,int into,HashMap<Integer,Integer> inMap){
        if(prefrom>preto) return  null;
        TreeNode root = new TreeNode(preorder[prefrom]);
        if(prefrom==preto) return  root;
        else{
            //左
            int a = inMap.get(preorder[prefrom]);//根节点在中序遍历中的位置。
            int leftCount = a-infrom;
            int rightCount = into-a;
            root.left = go(preorder,prefrom+1,prefrom+leftCount,inorder,infrom,a-1,inMap);
            root.right = go(preorder,preto-rightCount+1,preto,inorder,a+1,into,inMap);
            return  root;
        }

    }

}
