package leetcode.handpicktop.level1.level1reviewday3;

public class FactorialTrailingZeros {
    /**
     * 只关注5的个数：例如求125!中有多少个5相乘
     *
     * 125! 转化为
     * 125*120*115*...*25*20..*5 =
     * (25*5) * (24*5) * (23*5) * (22*5) * ...* (1*5)=
     * 25!*(25个5相乘)
     * 125！转化为了再求25！中有多少个5  +  25个5
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int total = 0;
        while(n!=0){
            n = n/5;//
            total+=n;
        }
        return  total;
     }
}
