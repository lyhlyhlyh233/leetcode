package leetcode.jzoffer.review1.day2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     11:14
 */
public class MostSmallInRotatingArray {
    //二分查找  找小的数
    public int minArray(int[] numbers) {
        int left = 0 , right = numbers.length-1;
        while(left < right){
                int mid = left + (right - left )/2;
                if(numbers[mid]<numbers[right])  right= mid;//左区间
                else if(numbers[mid]>numbers[right]) left = mid;//右区间
                else right -=1;
        }
        return  numbers[left];
    }
}
