package leetcode.jzoffer.review1.day7;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/15     11:31
 */
public class OverHalfNum {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length/2;
        return  nums[mid];
    }
}
