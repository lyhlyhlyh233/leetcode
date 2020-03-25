package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/20     14:25
 */

/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 *
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 */
public class HappyNumber {

    public int sumSquare(int n){
        int sum = 0 ;
        while(n!=0){
            int x = n%10; // 最后一位
            sum += x*x;
            n = n/10;
        }
        return  sum;
    }
    public boolean isHappy(int n) {
           int fast = n ; int slow = n ;
           do{
                fast = sumSquare(fast);
                fast = sumSquare(fast);
                slow = sumSquare(slow);
           }while(fast!=slow);

           return fast==1;
    }
}
