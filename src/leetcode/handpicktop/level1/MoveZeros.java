package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/13     14:13
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
//快慢指针，讲不等于0的快指针给慢指针
public class MoveZeros {
    public void moveZeroes(int[] nums) {
           int index = 0;
           for(int i = 0 ; i< nums.length;i++){
               if(nums[i]!=0){
                   nums[index] = nums[i];
                   index++;
               }
           }
           for(int j = index ; j < nums.length ; j++){
               nums[j] = 0 ;
           }
    }
}
