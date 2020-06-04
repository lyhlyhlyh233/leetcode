package leetcode.handpicktop.level1.level1reviewday2;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     10:53
 */
public class MissingNumber {
    //异或也可以
    public static int missingNumber(int[] nums) {
        if(nums.length == 0) return  0;
        int[] nums1 = new int[nums.length+1];
        for(int i = 0 ; i < nums.length ; i++){
            nums1[nums[i]] = 1;
        }
        for(int j = 1 ; j< nums1.length ;j++){
            if(nums1[j]==0) return  j;
        }
        //特殊情况 nums1[1]为0为缺失0
        return  0;
    }

    public static void main(String[] args) {
        missingNumber(new int[]{3,0,1});
    }
}
