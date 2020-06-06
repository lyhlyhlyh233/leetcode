package leetcode.handpicktop.level1.level1reviewday3;

public class RotateArray {
   // 要求使用空间复杂度为 O(1) 的 原地 算法。
    //每次移动1位，每次移动k位
    //还有环状和反转
    //环状
   public static  void rotate(int[] nums, int k) {
       int len = nums.length;
       k = k % len;
       int temp = nums[0];
       int temp1 = 0;
       int i = 0;//当前同学
       int start = 0;
       int count = 0;
       do{
          temp1 = nums[(i+k)%len];
          nums[(i+k)%len] = temp;
          temp = temp1;
          i= (i+k)%len;
          if(i==start){
              start = i++;
              i = start;
          }
          count++;
          if(count==len) break;
       }while(true);
   }

    public static void main(String[] args) {
        rotate(new int[]{-1,-100,3,99},2);
    }
}
