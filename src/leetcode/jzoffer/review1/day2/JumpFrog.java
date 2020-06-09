package leetcode.jzoffer.review1.day2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     11:07
 */
public class JumpFrog {
    public int numWays(int n) {
            if(n==0) return  1;
            if(n==1) return  2;
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 2;
            for(int i = 2 ; i< n ; i++){
                dp[i] = (dp[i-2]+dp[i-1])%1000000007;
            }
            return  dp[n-1];
    }
}
