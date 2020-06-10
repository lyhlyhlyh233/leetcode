package leetcode.jzoffer.review1.day3;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     17:56
 */
public class EditArray {
    //感觉类似快排
    public int[] exchange(int[] nums) {
        //i找偶数，j找奇数
            int i = 0 , j = nums.length-1;
            while(i<j){
                if(nums[i]%2!=0){
                    i++;
                    continue;
                }
                if(nums[j]%2==0){
                    j--;
                    continue;
                }
                int temp =nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            return  nums;
    }
}
