package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/25     14:09
 */

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
            int len  = digits.length;
            int[] digits1 = new int[len+1];
            for(int i = 0 ; i < len+1 ; i++){
                if(i==0) digits1[i]=0;
                else{
                    digits1[i]=digits[i-1];
                }
            }
            boolean isGo = true;//是否需要+1
            for(int i=len; i>=0;i--){
                int temp = digits1[i];
                if(isGo){
                    if(temp==9){
                        digits1[i]=0;
                        continue;
                    }
                    else {
                        digits1[i]+=1;
                        isGo=false;
                        break;
                    }
                }
            }
           if(digits1[0]==0) return Arrays.copyOfRange(digits1,1,len+1);
           else return  digits1;
    }
    public int[] plusOne1(int[] digits){
        
    }

}
