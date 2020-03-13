package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/12     10:54
 */

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElement {
    //快排
    public void quickSort(int[] nums,int left,int right){
            if(left > right) return;
            int k = nums[left];//不会动
            int i = left;
            int j = right;
            while (i<j){
                while(nums[j]>=k&&j>i){
                    j--;
                }
                while(nums[i]<=k&&j>i){
                    i++;
                }
                if(j>i){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            nums[left] =nums[i];
            nums[i] = k;
            quickSort(nums,left,i-1);
            quickSort(nums,i+1,right);
    }
    public int majorityElement(int[] nums) {
            quickSort(nums,0,nums.length-1);
            return nums[nums.length/2];
    }
    //投票算法
    public int boyer(int[] nums){
            int sum =0;
            int k =0;
            for(int  i = 0 ; i<nums.length;i++){
                  if(sum==0)  k = nums[i];
                  if(nums[i]==k) sum++;
                  else sum--;
            }
            return  k;
    }
}
