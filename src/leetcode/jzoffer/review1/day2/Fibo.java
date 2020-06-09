package leetcode.jzoffer.review1.day2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     10:56
 */
public class Fibo {
    public int fib(int n) {
            if(n==0) return  0;
            if(n==1) return  1;
            int[] dp = new int[n];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2 ; i < n ; i++){
                dp[i] = dp[i-1]+dp[i-2];
            }
            return  dp[n-1];
    }
}
