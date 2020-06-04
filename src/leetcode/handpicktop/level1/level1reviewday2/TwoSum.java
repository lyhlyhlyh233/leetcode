package leetcode.handpicktop.level1.level1reviewday2;

import java.util.HashMap;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     17:02
 */
public class TwoSum {
    //得出每个数的互补数，判断是否存在
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            hashMap.put(nums[i],i);
        }
        for(int i= 0 ; i< nums.length ; i++){
           int  target1 = target-nums[i];
            if(hashMap.containsKey(target1)&&!hashMap.get(target1).equals(i)){
               return  new int[]{i,hashMap.get(target1)};
           }
        }
        return  null;
    }

    public static void main(String[] args) {
         twoSum(new int[]{0,2,4},6);
    }
}
