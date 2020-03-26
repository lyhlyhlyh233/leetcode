package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/26     11:12
 */

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 */
public class RotateArray {
    /**
     * 输入: [1,2,3,4,5,6,7] 和 k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
            for(int i = 1; i<=k ;i++){
                rotate1(nums);
            }
    }
    //向右移动一位
    public void rotate1(int[] nums){
        if(nums.length == 0) return;
        int last = nums[nums.length-1];
        int pre = nums[0] ;
        int temp=0;
        for(int i = 1 ; i < nums.length ; i++){
            temp = nums[i];
            nums[i]=pre;
            pre = temp;
        }
        nums[0] = last;
    }
}
