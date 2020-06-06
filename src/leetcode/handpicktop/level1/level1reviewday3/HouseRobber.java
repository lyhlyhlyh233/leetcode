package leetcode.handpicktop.level1.level1reviewday3;

public class HouseRobber {
    //动态规划  可偷窃多个房屋
    public int rob(int[] nums) {
        //dp[i] = dp[i-2]+nums[i],dp[i-1]
        if(nums.length ==0) return 0;
        if(nums.length ==1 ) return  nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);
        for(int i= 2 ; i < nums.length ; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return  dp[nums.length-1];
    }
}
