package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/25     10:00
 */

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class IntersectionOfTwoArraysII {
    // 49 5               9 4 9 8 4
    // 4 5 9              4 4 8 9 9
    //小的动 双指针
    public int[] intersect(int[] nums1, int[] nums2) {
           Arrays.sort(nums1);
           Arrays.sort(nums2);
            int len1 = nums1.length;
            int len2 = nums2.length;
            int i = 0 ;
            int j = 0;
            int[] ans = new int[Math.min(len1,len2)];
            int a = 0;
            while(i<len1&&j<len2){
               if(nums1[i]==nums2[j]){
                   ans[a] = nums1[i];
                   i++;j++;
                   a++;
               }
               else if(nums1[i]>nums2[j]){
                   j++;
               }
               else
                   i++;
            }
        return  Arrays.copyOf(ans,a);

    }
}
