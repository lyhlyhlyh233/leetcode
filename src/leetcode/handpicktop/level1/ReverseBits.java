package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/20     14:51
 */

/**
 * 颠倒给定的 32 位无符号整数的二进制位。
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int x = 0;
        int j = 0;
        while(j<32){
            x = x<<1;
            x += n&1;
            n = n>>>1;
            j++;
        }
        return  x ;
    }
}
