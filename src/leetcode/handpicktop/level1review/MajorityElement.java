package leetcode.handpicktop.level1review;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     14:39
 */
public class MajorityElement {
    //找到超过一半的数//排序
    public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int mid = (nums.length)/2;
            return  nums[mid];
    }
}
