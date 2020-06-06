package leetcode.handpicktop.level1.level1reviewday3;

import java.util.HashMap;

public class FirstCharOnce {
    //你可以假定该字符串只包含小写字母。所有可以不用hash表
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            map[s.charAt(i)-'a'] +=1;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(map[s.charAt(i)-'a']==1) return  i;
        }
        return  -1;
    }
}
