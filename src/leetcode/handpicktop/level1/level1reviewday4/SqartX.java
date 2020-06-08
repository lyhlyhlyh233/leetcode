package leetcode.handpicktop.level1.level1reviewday4;

import java.math.BigDecimal;

public class SqartX {
    //求x的平方根，用二分法
    public  static int erFen(int begin,int end,int x){
        if(begin==end) return  end;
        float midf = begin+(end-begin)/2.0f+0.5f;//当中点是两个元素时，选右边的
        int mid = (int)midf;
        //判断中点的平方比较x的大小
        //int v = mid*mid;//超出int范围
        BigDecimal bx = new BigDecimal(x);
        BigDecimal m = new BigDecimal(mid);
        BigDecimal v = m.multiply(m);
        if(v.compareTo(bx)>0) return  erFen(begin,mid-1,x);
        else if(v.compareTo(bx)<0) return  erFen(mid,end,x);
        else return mid;
    }
    public static  int mySqrt(int x) {
        return  erFen(0,x,x);
    }

    public static void main(String[] args) {
            mySqrt(8);
    }
}
