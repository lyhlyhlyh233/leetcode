package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/12     9:56
 */

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * N的时间复杂度，并且不使用额外空间
 */
//异或  相同为0，不同为1。
// a^0 = a;
public class SingleNumber {
    public int singleNumber(int[] nums) {
            int sum = 0;
        for(int i =0 ; i < nums.length ;i++){
            sum ^= nums[i];
        }
        return sum;
    }
}
