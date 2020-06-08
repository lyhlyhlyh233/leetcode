package leetcode.handpicktop.level1.level1reviewday4;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     10:39
 */
public class CountPrimes {
    public static  boolean isPrime(int n ){
        if(n<2) return  false;
        for(int i = 2 ; i*i<n;i++){
            if(n%i==0) return  false;
        }
        return  true;
    }

    public static int countPrimes(int n) {
            //如果一个数是质数，他的倍数，都不是质数。
            // x是不是质数   0  --看这个范围内有没有能整除的---- x的平方根    x
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i < n; i++)
            if (isPrim[i])
                for (int j = i * i; j < n; j += i)
                    isPrim[j] = false;
        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrim[i]) count++;
        return count;
    }

    public static void main(String[] args) {
        countPrimes(10);
    }
}
