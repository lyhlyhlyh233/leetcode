package leetcode.jzoffer.review1.day3;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     10:01
 */
public class MyPow {
    //位运算 表达方式冗余，待优化
    public  static double myPow(double x, int n) {
        //n转化为正 pow
        long n1 = n;
        long pow = n1>0?n1:-n1;
        //记录位
        int index = 0;
        double sum =  1 ;
        double base = x*x;
        while(pow!=0){
            long littlePow = pow&1;
            if(littlePow==1){
                long  flag = 1L<<index;
                flag = flag/2;
                if(flag == 0){
                    sum = x;
                }
                for(int i = 0 ; i<flag;i++){
                    sum = sum*base;
                }
            }
            pow = pow>>>1;
            index++;
        }
        if(n<0) {
            return  1/sum;
        }
        else {
            return  sum;
        }
    }

    public static void main(String[] args) {
        myPow(1,-2147483648);
    }
}
