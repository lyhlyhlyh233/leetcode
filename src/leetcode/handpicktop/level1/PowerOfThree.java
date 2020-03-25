package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/25     10:52
 */

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
          if(n==0||n==2 ) return  false;
          if(n==1) return  true;
            while(true){
                if(n%3==0){
                    n=n/3;
                    if(n==1) return true;
                }
                else return  false;
            }
    }
    public boolean isPowerOfThree1(int n ){
         return false;
    }

    public static void main(String[] args) {
        new PowerOfThree().isPowerOfThree1(2147483647);
    }
}
