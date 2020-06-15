package leetcode.jzoffer.review1.day7;

import java.util.HashSet;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/15     11:01
 */
public class Permutation {
    //排列
    //通过交换元素来实现。
    public String[] permutation(String s) {
        HashSet<String> set = new HashSet<>();
        if(s==null) return  null;
        char[] str = s.toCharArray();
         go(set,0,str);
         return  set.toArray(new String[set.size()]);

    }
    public void  go(HashSet<String> set,int start,char[] str){
        if(start == str.length){
            set.add(new String(str));
            return;
        }
        for(int i = start; i < str.length; i++){
                swap(str,start,i);
                go(set,start+1,str);
                swap(str,start,i);
        }
    }
    public void swap ( char[] str , int i , int j){
            char temp  = str[i];
            str[i] = str[j];
            str[j] = temp;
    }

}
