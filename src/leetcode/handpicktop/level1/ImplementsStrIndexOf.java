package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/27     13:42
 */

/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class ImplementsStrIndexOf {
    //滑动窗口
    public int strStr(String haystack, String needle) {
        if(needle==null||needle.length()==0) return 0;
        if(haystack==null||haystack.length()==0) return -1;
        int lh = haystack.length();
        int ln = needle.length();
        for(int i = 0 ; i < (lh-ln+1);i++){
            if(!(haystack.charAt(i) == needle.charAt(0))) continue;
            if(haystack.substring(i,i+ln).equals(needle))
                return  i;
        }
        return  -1;

    }
}
