package leetcode.handpicktop.level1.level1reviewday3;

import java.util.Arrays;

public class MergeSortedArray {
    //将
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 , j = 0 , x = 0;
        int[] nums = new int[m+n];
        while(x<(m+n)){
            if(i>=m){
                nums[x] = nums2[j];
                x++;j++; continue;
            }
            else if(j>=n){
                nums[x] = nums1[i];
                x++;i++; continue;
            }
            else if(nums1[i]<=nums2[j]){
                nums[x] = nums1[i];
                x++;i++; continue;
            }
            else if(nums2[j]<nums1[i]){
                nums[x] = nums2[j];
                x++;j++; continue;
            }
        }
        for(int y = 0 ; y<(m+n) ; y++){
            nums1[y] = nums[y];
        }
    }
}
