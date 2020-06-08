package leetcode.handpicktop.level1.level1reviewday3;

public class ImplementsIndexOf {
    public int strStr(String haystack, String needle) {
        if(haystack==null) return -1;
        if(needle==null) return  0;
        int len = needle.length();
        for(int i = 0 ; i < (haystack.length()-len+1) ; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+len-1).equals(needle)){
                    return  i;
                }
            }
        }
        return  -1;
    }
}
