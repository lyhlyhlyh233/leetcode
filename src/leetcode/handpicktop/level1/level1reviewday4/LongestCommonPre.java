package leetcode.handpicktop.level1.level1reviewday4;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/8     9:56
 */
public class LongestCommonPre {
    //寻找最长公共前缀
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int len = strs.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < len ; i++ ){
            if(strs[i].length()<min) min = strs[i].length();
        }
        for(int i = 0 ; i < min ;i++){
            char c = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length ; j++){//遍历数组
                char c1 =  strs[j].charAt(i);
                if(c!=c1){//
                    return  strs[0].substring(0,i);
                }
            }
            return  strs[0].substring(0,min);
        }
        return  "";
    }
}
