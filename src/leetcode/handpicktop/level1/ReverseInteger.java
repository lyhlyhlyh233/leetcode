package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/27     15:53
 */

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class ReverseInteger {
    public static  int reverse(int x) {
            int ans = 0;
            while(x!=0){
                int n = x % 10 ;
                x=x/10;
                if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && n > 7)) return 0;
                if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && n < -8)) return 0;
                ans=ans*10+n;
            }
            return  ans;
    }

    public static void main(String[] args) {
        reverse(-2147483648);
    }
}
