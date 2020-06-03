package leetcode.handpicktop.level1review;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     10:31
 */
public class ReverseString {
    //原地修改，通过交换来反转
    public void reverseString(char[] s) {
            if(s.length <=1)  return;
            int i = 0;
            int j = s.length-1;
            char temp;
            while(i<j){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
    }
}
