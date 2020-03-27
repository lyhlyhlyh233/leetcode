package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/27     17:26
 */

/**
 * 统计所有小于非负整数 n 的质数的数量。
 */
public class CountPrimes {
    /**
     * 判断该整数是否是质数: 只能被1和自己整除
     * @param n
     * @return
     */
    public boolean isPrimes(int n){
        if(n<2) return  false;
        for(int i = 2 ; i< n/2+1 ;i++){
            if(n%i==0)
                return  false;
        }
        return  true;
    }
    public int countPrimes(int n) {
            int count =0;
            for(int i = 2 ; i < n ; i++){
                if(isPrimes(i)) count++;
            }
            return  count;
    }
}
