package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/12     10:09
 */

/**
 *  1的个数
 *  编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 */
public class NumberOfOneBits {
    public int hammingWeight(int n) {
          int sum=0;
          while(n!=0){
              sum++;
              n &=(n-1);
          }
         return sum;
    }

}
