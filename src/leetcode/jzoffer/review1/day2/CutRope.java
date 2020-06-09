package leetcode.jzoffer.review1.day2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     16:13
 */

import java.math.BigDecimal;

/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class CutRope {
    public int cuttingRope(int n) {
        //动态规划 dp[i]当前i能获得的最大乘积
        BigDecimal[] dp = new BigDecimal[n+1];
        if (n < 4 ) {
            return n-1;
        }
        dp[1] =  new BigDecimal(1);
        dp[2] = new BigDecimal(2);
        dp[3] = new BigDecimal(3);
        for (int i = 4; i <= n; i++) {
            BigDecimal max = new BigDecimal(0);
            for (int j = 1; j < i; j++) {
                BigDecimal value = dp[j].multiply(dp[i-j]);
                max = value.compareTo(max)>0?value:max;
            }
            dp[i] = max;
        }
        int result = (dp[n].divideAndRemainder(new BigDecimal(1000000007)))[1].intValue();
        return  result;
    }
}
