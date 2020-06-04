package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     14:04
 */
public class SumOfTwoInteger {
    //不使用+ -，算两整数之和
    // ^ & | *   >> <<
    // ^ 缺少进位
    // & 获得进位数
    public int getSum(int a, int b) {
            while(b!=0){//需要进位
                int carry = (a&b)<<1;//需要进位的地方
                a = a^b;//异或结果
                b = carry;
            }
            return  a;
    }
}
