package leetcode.handpicktop.level1.level1reviewday2;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     15:36
 */
public class ContainsDuplicate {
    //判断是否存在重复元素
    //先排序，再两两相比
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i= 0 ; i<nums.length-1 ; i++){
            if(nums[i] == nums[i+1]) return  true;
        }
        return  false;
    }
}
