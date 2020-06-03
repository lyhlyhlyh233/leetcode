package leetcode.handpicktop.level1review;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     16:04
 */
public class IsHappyNum {
    private int pinfanghe(int n ){
        int N = 0;
        while(n!=0){
            int x = n%10;//个位数
            n /=10;
            N+=x*x;
        }
        return  N;
    }
    //快慢指针
    public boolean isHappy(int n) {
            int fast = n,slow = n;
            do{
                slow = pinfanghe(slow);
                fast = pinfanghe(fast);
                fast = pinfanghe(fast);
            }while(fast!=slow);
            return  slow==1;
    }
}
