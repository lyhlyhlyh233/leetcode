package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/24     14:48
 */

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 连续子数组，不是递增
 */

public class MaxSubarray {
    //动态规划
    //dp[i]表示前i个元素包 含nums[i]的最大子序和
    /**
     * [-2,1,-3, 2]
     *     [-2]  -2
     *     [-2 1]  [1]    1
     *     [-2,1,-3]  [1,-3]  [-3]     -2
     *     [-2,1,-3,-2]  [1,-3,2] [-3,2] [2]    2
     *
     */



    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int ans = nums[0];
        for(int i = 1 ; i < len ; i++){
            dp[i] = Math.max(dp[i-1],0)+nums[i];
            ans = Math.max(ans,dp[i]);
        }
        return  ans;


    }
}
