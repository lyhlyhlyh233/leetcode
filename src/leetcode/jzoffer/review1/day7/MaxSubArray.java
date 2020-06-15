package leetcode.jzoffer.review1.day7;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/15     17:33
 */
public class MaxSubArray {
    //最大连续子数组
    //dp[i] 以 i结尾的连续子数组的最大值
    //dp[i] = dp[i-1]+i        i
    public  static int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            if(nums.length == 0) return  -1;
            dp[0] = nums[0];
            int max =dp[0];
            for(int i = 1 ; i< nums.length ; i++){
                dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
                if(dp[i]>max) max = dp[i];
            }
            return  max;
    }

    public static void main(String[] args) {
           maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
