package leetcode.jzoffer.review1.day1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     17:14
 */
public class ReplaceBlank {
    public String replaceSpace(String s) {
            StringBuffer sb  = new StringBuffer();
            for(int i = 0 ; i < s.length() ;i++){
                if(s.charAt(i)!=' ') sb.append(s.charAt(i));
                else sb.append("%20");
            }
            return  sb.toString();
    }
}
