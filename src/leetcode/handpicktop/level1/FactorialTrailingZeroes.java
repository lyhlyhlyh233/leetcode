package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/26     14:15
 */

/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * 你算法的时间复杂度应为 O(log n) 。
 */
public class FactorialTrailingZeroes {
    // 5*2  5比2多，且有5必有2
    //寻找有多少个5
    // n=25
    //  25 20 15 10 5
    // 125 120 115 ... 25
    //  125 = 5*25   =（1*5+24*5）；
    // 125*120*..*1 = 25*5*24*5*23*5...=(25!)*25
//    自己的理解
//    只关注5的个数：例如求125!中有多少个5相乘
//    125! 转化为
//    125*120*115*...*25*20..*5 =
//    (25*5) * (24*25) * (23*5) * (22*5) * ...* (1*5)=
//    25!*(25个5)
//    转化为了再求25！中有多少个5

    //
    //
    //
    public int trailingZeroes(int n) {
        int count =0;
        while(n!=0){
            count += n/5;
            n/=5;
        }
        return  count;
    }
}
