package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/13     10:57
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1=nums2 ;
            return;
        }
        if(n==0){
            return;
        }
         int i = 0;
         int j = 0;
         int k = 0;
         int[] nums=new int[m+n];
         while(k<(m+n)){
             int val1 = i<m?nums1[i]:Integer.MAX_VALUE;
             int val2 = j<n?nums2[j]:Integer.MAX_VALUE;
             if(val1<val2){
                 nums[k] = val1;
                 i++;
             }
            else {
                 nums[k]=val2;
                 j++;
             }
            k++;
         }
         nums1=nums;

    }
    public static void main(String[] args) {
            int[] nums1 = {1,2,3,0,0,0};
            int[] nums2 = {2,5,6};
            new MergeSortedArray().merge(nums1,3,nums2,3);
    }
}
