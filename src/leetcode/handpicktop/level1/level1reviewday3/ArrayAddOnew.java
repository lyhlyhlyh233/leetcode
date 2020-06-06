package leetcode.handpicktop.level1.level1reviewday3;

import java.util.Arrays;

public class ArrayAddOnew {
    public int[] plusOne(int[] digits){
        int[] result = new int[digits.length+1];
        boolean flag = true;
        for(int i = result.length-1 ; i >= 0 ; i--){
            if(flag){
                int n = digits[i-1]+1;
                if(n>9){
                    int a = n%10;
                    result[i]= a;
                    flag=true;
                }
                else{
                    result[i] = n;
                    flag = false;
                }
            }
            else{
                result[i] = digits[i-1];
            }
        }
        if(result[0]==0) return Arrays.copyOfRange(result,1,result.length);
        return  result;
    }
}
