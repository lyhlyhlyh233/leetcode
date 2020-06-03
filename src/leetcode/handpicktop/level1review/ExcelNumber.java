package leetcode.handpicktop.level1review;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     14:08
 */
public class ExcelNumber {
    //A-Z  1-26 26   进制
    public int titleToNumber(String s) {
        //从低位到高位
        int j = 1;
        int total = 0 ;
        for(int i = (s.length()-1);i>=0;i--){
            char c = s.charAt(i);
            int n = c-'A'+1;
            total = total+n*j;
            j = j*26;
        }
        return  total;
    }
}
