package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/20     15:01
 */

import java.util.Arrays;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0 ; i< len ; i++){
            if(i!=nums[i]) return  i;
        }
        return  nums[len-1];
    }
    public int missingNumber2(int[] nums) {
        int len = nums.length;
        int[] sort = new int[len+1];
        for(int i = 0 ; i < len ; i++){
            int j = nums[i];
            sort[j-1] = 1;
        }
        for(int i = 0 ; i<len;i++){
            if(sort[i]==0) return  i;
        }
        return  len;
    }
}
