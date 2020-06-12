package leetcode.jzoffer.review1.day5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/12     16:02
 */
public class DepthBinaryTree {
     public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    /**
     *  深度优先搜索
     * @param root  根节点
     * @param sum  每一次的结果
     * @param list     存节点
     * @param result  存放最终结果
     * @param  target 目标值
     * @return
     */
    public void go(TreeNode root,int sum,List<Integer> list,List<List<Integer>> result,int target){
            if(root == null) {
                return;
            }
            if(root.left==null&&root.right==null) {
                    if((sum+root.val)==target){
                        list.add(root.val);
                        int temp1 = list.size();
                        ArrayList<Integer> res = new ArrayList<>();
                        for(Integer i : list){
                            res.add(i);
                        }
                        result.add(res);
                        list.remove(temp1-1);
                    }
                    return;
            }
            list.add(root.val);
            int temp = list.size();
            go(root.left,sum+root.val,list,result,target);
            go(root.right,sum+root.val,list,result,target);
            list.remove(temp-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         if(root == null ) return  result;
          go(root , 0,list, result,sum);
          return  result;
    }
}
