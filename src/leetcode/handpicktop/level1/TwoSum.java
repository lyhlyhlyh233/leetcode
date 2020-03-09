package leetcode.handpicktop.level1;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */

public class TwoSum {
    //思路，遍历：从一串数里随机取两个数
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    //思路2 知道每个数的互补数是多少，从记录中寻找互补数
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int teammate = target - nums[i];
            if (hashMap.get(teammate) != null ) {
                return new int[]{hashMap.get(teammate), i};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(nums, target));
        System.out.println((twoSum.twoSum1(nums, target))[0] + " " + (twoSum.twoSum(nums, target))[1]);
    }
}
