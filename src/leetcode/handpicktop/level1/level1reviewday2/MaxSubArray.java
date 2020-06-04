package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     15:50
 */
public class MaxSubArray {
    //最大连续子序列
    //dp[i]  以i结尾的最大连续子序的的和
    public int maxSubArray(int[] nums) {
        int len =nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i= 1; i < len ;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i]>max) max = dp[i];
        }
        return max;
    }
}
