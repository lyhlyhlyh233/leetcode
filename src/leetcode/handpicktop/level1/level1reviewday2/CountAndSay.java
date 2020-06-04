package leetcode.handpicktop.level1.level1reviewday2;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     11:10
 */
public class CountAndSay {
    /**
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
       if (n==1) return  "1";
       String pre = countAndSay(n-1);//第几次的长度无法确定
       int len = pre.length();
       int j = 0; //慢指针
        String ans = "";
        for(int i = 0 ; i <= len ; i++){//快指针要遍历完pre的所有元素，并出界
            if(i==len||pre.charAt(i)!=pre.charAt(j)){
                ans = ans + (i-j) + pre.charAt(j);
                j=i;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        countAndSay(4);
    }
}
