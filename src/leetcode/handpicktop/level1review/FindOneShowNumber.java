package leetcode.handpicktop.level1review;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     10:49
 */
public class FindOneShowNumber {
    //异或 相同为0 不同为1 0异或a = a
    public int singleNumber(int[] nums) {
        int total = 0;
        for(int  i = 0 ; i < nums.length ; i++ ){
            total =total^nums[i];
        }
        return  total;
    }
}
