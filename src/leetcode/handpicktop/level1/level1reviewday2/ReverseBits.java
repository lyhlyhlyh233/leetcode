package leetcode.handpicktop.level1.level1reviewday2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     9:45
 */
public class ReverseBits {
    public static int reverseBits(int n) {
          int result = 0;
          int count = 0;
          while(count<32){
              result = result<<1;
              int temp = n&1;//低位
              n=n>>>1;
              result = result|temp;
              count++;
          }
          return  result;
     }

    public static void main(String[] args) {
        reverseBits(-3);
    }
}
