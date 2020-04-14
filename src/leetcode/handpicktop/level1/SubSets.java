package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/30     10:33
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 */
public class SubSets {
    static  List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public static void backSub(int[] nums,int index,ArrayList<Integer> list){
          if(index == nums.length){
              ArrayList<Integer> temp1= (ArrayList<Integer>) list.clone();
              ans.add(temp1);
              return;
          }
          ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();

          list.add(nums[index]);
          backSub(nums,index+1,list);

          list = (ArrayList<Integer>) temp.clone();
          backSub(nums,index+1,list);
    }

    public List<List<Integer>> subsets(int[] nums) {
             ArrayList<Integer> list = new ArrayList<>();
            backSub(nums,0,list);
            return  ans;
    }
}
