package leetcode.handpicktop.level1.level1reviewday2;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     17:16
 */
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = Math.min(len1,len2);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[len];
        int i = 0 , j = 0;
        int r= 0;
        while(true){
            if(i==len1||j==len2) break;
            else if(nums1[i]==nums2[j]){
                result[r] = nums1[i];
                r++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return  Arrays.copyOfRange(result,0,r);
    }
}
