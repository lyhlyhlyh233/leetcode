package leetcode.jzoffer.review1.day2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     17:50
 */
public class CutRope2 {
    //贪心算法  3、4特殊处理 注意用Long
    public int cuttingRope(int n) {
        if (n < 4) {
            return n - 1;
        }
        long sum = 1;
        while (n > 4) {
            sum = sum * 3;
            sum = sum % 1000000007;
            n -= 3;
        }
        return (int)((sum*n)%1000000007);
    }
}
