package leetcode.handpicktop.level1.level1reviewday2;

import java.util.Arrays;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     9:35
 */
public class VaidSameWord {
    public static  boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return String.valueOf(tc).equals(String.valueOf(sc));
    }

    public static void main(String[] args) {
        isAnagram("anagram","nagaram");
    }
}
