package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/25     13:58
 */

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 */
public class HouseRobber {
    //前n间房能偷到的最高金额
    //偷n-1的金额 vs 不偷n-1的金额(n-2的最高金额) + n的金额
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        if(len==0) return 0;
        if(len==1) return  nums[0];
        if(len == 2) return   Math.max(nums[0],nums[1]);
        dp[0] = nums[0]; //第一间房
        dp[1] =  Math.max(dp[0],nums[1]);               //第二间房
        for(int i = 2 ; i<len ;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return  dp[len-1];
    }
}
