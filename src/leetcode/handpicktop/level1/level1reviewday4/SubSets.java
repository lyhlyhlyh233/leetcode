package leetcode.handpicktop.level1.level1reviewday4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     13:54
 */
public class SubSets {
   // 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
    //注意增加和去除，注意深拷贝与浅拷贝
    public  static void go(int[] nums,int i,List<List<Integer>> lists,List<Integer> list){
                if(i==nums.length){
                    //得为新生成一块地址
                    ArrayList<Integer> listans = new ArrayList<>();
                   for(Integer x : list){
                       listans.add(x);
                   }
                    lists.add(listans);
                    return;
                }
                //取本nums[i]
                list.add(nums[i]);
                go(nums,i+1,lists,list);
                //不取
                list.remove((Integer)nums[i]);
                go(nums,i+1,lists,list);
    }

   public static  List<List<Integer>> subsets(int[] nums) {
        if(nums.length==0) return  null;
            //递归，每次有两种选择，拿或者不拿
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        go(nums,0,lists,list);
        return  lists;
   }

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }

}
