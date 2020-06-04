package leetcode.handpicktop.level1.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     15:13
 */
public class MoveZeros {
    //将0移动到数组尾部，原数组操作
    //快慢指针  快指针负责找到不是0的数
    public static  void moveZeroes(int[] nums) {
            int i = nums.length , j = 0;
            for(int x = 0 ; x<nums.length ;x++){
                if(nums[x]==0){ i = x; break; }
            }
            j=i+1;
            while(j<nums.length){
                if(nums[j]!=0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                }
                j++;
            }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
