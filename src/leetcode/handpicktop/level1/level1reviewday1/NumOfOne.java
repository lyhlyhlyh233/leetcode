package leetcode.handpicktop.level1.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     11:27
 */
public class NumOfOne {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {//无符号整数值位1的个数
        //右移
        int sum = 0;
        while(n!=0){
            if((n&1)==1) {
                sum++;
            }
            n=n>>>1;
        }
        return sum;
    }
}
