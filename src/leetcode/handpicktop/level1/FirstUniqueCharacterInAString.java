package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/25     13:48
 */

import java.util.TreeMap;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] cal = new int[26];
        for(int i=0; i < s.length() ; i++){
                cal[s.charAt(i) - 97]+=1;
        }
        for(int j = 0 ; j < s.length() ; j++){
            if(cal[s.charAt(j)-97]==1) return  j;
        }
        return  -1;
    }
}
