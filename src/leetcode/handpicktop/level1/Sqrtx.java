package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/27     15:12
 */

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 */
public class Sqrtx {
    //      0   0
    //      1  1   1    2    2   3
    //二分法
     public int mySqrt(int x) {
         if(x<2) return  x;
         int left = 0;
         int right = x;
         int mid = x/2;
         while(left<=right){
             mid = left+(right-left)/2;
             long temp = (long)mid*mid;
             long next = (long)(mid+1)*(mid+1);
             if(temp==x) return  mid;
             if(temp<x && next>x) return mid;
             if(temp<x){
                 left = mid+1;
             }
             if(temp>x){
                 right = mid-1;
             }
         }
         return  0;
    }
}
