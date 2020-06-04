package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     16:56
 */
public class ClimbilngStairs {
    //dp[n] = dp[n-1]
    //dp[n] = dp[n-2]
    public int climbStairs(int n) {
        if(n==1) return 1;
            int dp[] = new int[n];
            dp[0] = 1;
            dp[1] = 2;
            for(int i = 2 ; i < n; i++){
                dp[i] = dp[i-1]+dp[i-2];
            }
            return dp[n-1];
    }
}
