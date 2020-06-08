package leetcode.handpicktop.level1.level1reviewday4;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     10:14
 */
public class ReverseInteger {
    public static int reverse(int x) {
        boolean flag = x<0;
        int result = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(x!=0){
            int y = Math.abs(x%10);//个位
            //判断是否越界
            if(result>(max/10)) return  0;
            result = result*10;//左移
            result+=y;
            x= x/10;
        }
        //处理符号
        if(flag) {
            if(result==max) return  0;
            else return 0-result;
        }
        return  result;
    }

    public static void main(String[] args) {
reverse(-2147483648);
    }
}
