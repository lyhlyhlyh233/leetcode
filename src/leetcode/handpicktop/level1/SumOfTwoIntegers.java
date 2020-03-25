package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/23     9:54
 */

/**
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 */
//位运算
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
            if(a==0) return  b;
            if(b==0) return  a;
            int lower =0;
            int carries = 0;
            while(true){
                lower = a^b;  //低位
                carries = a&b; //进位
                if(carries==0) break;
                a = lower;
                b = carries<<1;
            }
            return  lower;
    }
}
