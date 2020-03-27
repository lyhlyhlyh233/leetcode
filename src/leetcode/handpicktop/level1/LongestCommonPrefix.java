package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/27     15:36
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        for(int i = 0 ; i<strs[0].length();i++){
            char temp = strs[0].charAt(i);
            int flag = 0;
            for(int j = 0 ; j < strs.length ; j++){//遍历剩余的字符串
                String s = strs[j];
                if(i<s.length()){
                    if(s.charAt(i)==temp)
                        continue;;
                }
                flag = 1;
                break;

            }
            if(flag==1)
                return strs[0].substring(0,i);
        }
        return  strs[0];
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower","flow","flight"});
    }
}
