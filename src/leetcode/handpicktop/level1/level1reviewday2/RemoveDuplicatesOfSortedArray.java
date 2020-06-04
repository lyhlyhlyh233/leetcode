package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     16:31
 */
public class RemoveDuplicatesOfSortedArray {
    //双指针，快慢指针，与移动0类似
    public int removeDuplicates(int[] nums) {
        int i = 0 , j =1 ;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            j++;
        }
        return  i+1;
    }
}
