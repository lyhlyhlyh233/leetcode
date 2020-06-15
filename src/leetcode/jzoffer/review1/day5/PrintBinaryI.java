//package leetcode.jzoffer.review1.day5;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
///**
// * @Author :   lyh
// * @Dtae :     2020/6/12     13:45
// */
//public class PrintBinaryI {
//    public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
//    //广度优先搜索
//    public  void go(ArrayList<TreeNode> cur,ArrayList<Integer> result){
//            if(cur.size()==0) return;
//            ArrayList<TreeNode> temp = new ArrayList<>();
//            for(TreeNode node : cur){
//                result.add(node.val);
//                if(node.left!=null)   temp.add(node.left);
//                if(node.right!=null)   temp.add(node.right);
//            }
//            go(temp,result);
//    }
//    //用一个list来保存当前层。用一个list里存所有的结果
//    public int[] levelOrder(TreeNode root) {
//        ArrayList<TreeNode> cur = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//        if(root == null) {
//            return  new int[]{};
//        }
//        cur.add(root);
//        go(cur,result);
//        int[] res = new int[result.size()];
//        for(int i = 0 ; i < result.size() ; i++){
//            res[i] = result.get(i);
//        }
//        return  res;
//    }
//    public void go( List<List<Integer>>  result,List<TreeNode> cur){
//            if(cur.size()==0) return;
//            ArrayList<Integer> list = new ArrayList<>();
//            ArrayList<TreeNode> next = new  ArrayList<>();
//            for(TreeNode node : cur){
//                list.add(node.val);
//                if(node.left!=null)  next.add(node.left);
//                if(node.right!=null) next.add(node.right);
//            }
//            result.add(list);
//            go(result,next);
//    }
//    public List<List<Integer>> levelOrder1(TreeNode root) {
//            List<List<Integer>> result = new ArrayList<List<Integer>>();
//            if(root==null) return  null;
//            List<TreeNode> cur = new ArrayList<>();
//            cur.add(root);
//            go(result,cur);
//            return  result;
//     }
//    //next永远正序添加
//    public void go( List<List<Integer>>  result,List<TreeNode> cur){
//        if(cur.size()==0) return;
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<TreeNode> next = new  ArrayList<>();
//        for(TreeNode node : cur){
//            list.add(node.val);//打印
//            if(node.right!=null) next.add(node.right);
//            if(node.left!=null)  next.add(node.left);//下一层
//        }
//        if((result.size()&1)==1){//在添加结果之前是奇数，添加后是偶数层
//            Collections.reverse(list);
//        }
//        result.add(list);
//        go(result,next);
//    }
//    public List<List<Integer>> levelOrder2(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        if(root==null) return  null;
//        List<TreeNode> cur = new ArrayList<>();
//        cur.add(root);
//        go(result,cur);
//        return  result;
//    }
//
//}
