package leetcode.jzoffer.review1.day3;

import java.util.ArrayList;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     12:09
 */
public class OneToN {
    public int[] printNumbers(int n) {
        //算出n位条件最大数  99999
        int ans = 0;
        while(n!=0){
            ans = ans*10;
            ans+=9;
            n--;
        }
        int[] result = new int[ans];
        for(int i = 0 ; i < ans ; i ++){
            result[i] = i+1;
        }
        return  result;
      }
}
