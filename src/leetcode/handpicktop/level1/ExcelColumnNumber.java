package leetcode.handpicktop.level1;

public class ExcelColumnNumber {
    //26进制数转10进制
    public int titleToNumber(String s) {
        char[] cary = s.toCharArray();
        int sum = 0;
        for(int i = 0 ; i < cary.length ; i++){
            int n = cary[i] - 65 + 1; //A=1
            int a = (int)Math.pow(26,cary.length-i-1);  //当前位置1单位的值 //每次都要算，比较耗时间。
            sum+=a*n;
        }
        return  sum;
    }
    //思路2: 反向
    public int titleToNumber1(String s) {
        int pow = 1;
        int sum = 0;
        for(int i = s.length()-1 ; i>=0; i--){
            char c = s.charAt(i);
            int n = c-64;
            sum+=n*pow;
            pow = pow*26;

        }
        return  sum;
    }
}
