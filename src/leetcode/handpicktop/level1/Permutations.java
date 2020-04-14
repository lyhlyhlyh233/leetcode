package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/30     11:14
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class Permutations {
    public List<List<Integer>>  ans = new ArrayList<List<Integer>>();
    public int[] deleteI(int[] nums,int index){
        int[] newary = new int[nums.length-1];
        int j =0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i==index) i++;
            if(i==nums.length) break;
            newary[j]=nums[i];
            j++;
        }
        return newary;
    }
    public void backPer(int[] nums,ArrayList<Integer> list){
        if(nums.length==0) ans.add(list);
        for(int i = 0 ; i<nums.length;i++){
            int[] tempnums = Arrays.copyOf(nums,nums.length);
             ArrayList<Integer>  temp = (ArrayList<Integer>)list.clone();

            list.add(nums[i]);

            nums = Arrays.copyOf(tempnums,tempnums.length);
            nums = deleteI(nums,i);
            list = (ArrayList<Integer>)temp.clone();
            backPer(nums,list);

            nums = Arrays.copyOf(tempnums,tempnums.length);
            list = (ArrayList<Integer>)temp.clone();
        }
    }
    public List<List<Integer>> permute(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            backPer(nums,list);
            return  ans;
    }
}

