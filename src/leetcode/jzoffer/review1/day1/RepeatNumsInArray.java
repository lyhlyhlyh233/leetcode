package leetcode.jzoffer.review1.day1;

import java.util.HashSet;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     15:22
 */
public class RepeatNumsInArray {
    // 数组中重复的数字 找出任意一个重复数字
    //一种是hash表，一直是排序后比较相邻元素
    public int findRepeatNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i<nums.length;i++){
                    if(set.contains(nums[i])) return  nums[i];
                    else set.add(nums[i]);
            }
            return -1;
    }
    //数据有限制,在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内；可以构建特殊的哈希表
    public int findRepeatNumber1(int[] nums) {
             int[] nums1 = new int[nums.length];
             for(int i = 0 ; i < nums.length ;i++){
                 if(nums1[nums[i]]!=0) return  nums[i];
                 else nums1[nums[i]] =1 ;
             }
             return  -1;
    }
    //原地置换 6
    public int findRepeatNumber2(int[] nums) {
      int i = 0 ;
      while(true){
                if(nums[i]!=i){//发生置换
                        int temp = nums[i];
                        nums[i] = i;
                        i = temp;
                }
        }

    }
}
