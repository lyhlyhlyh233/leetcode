package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/26     9:43
 */

import javax.sound.midi.Soundbank;
import java.util.logging.SocketHandler;

/**
 * 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */
public class ValidPalindrome {
    public boolean isLegal(char c){
        String s=c+"";
        if(s.matches("[0-9]")||s.matches("[a-z]")) return  true;
        //if((c>=0&&c<=9)||(c>=97&&c<=122)) return  true;
        else return false;
    }
    public  boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int len = s.length();
        for(int i = 0 ; i< len ; i++){
            char c = s.charAt(i);
          //  System.out.println(c);
            if(!isLegal(c)){
                System.out.println(c);
                s= s.replace(c,' ');
            }
        }

        s = s.trim().replaceAll(" ","");
        System.out.println(s);
        len = s.length();
        int i = 0 ;
        int j = len-1;
        while(i<j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
             if(ci!=cj) return  false;
             i++;
             j--;
        }
        return  true;
    }
    public static boolean isPalindrome1(String s){
        if(s==null) return  true;
        s = s.toLowerCase();
        int len = s.length();
        int i = 0;
        int j = len-1;
        while(i<j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!((ci>=48&&ci<=57)||(ci>=97&&ci<=122))){
                i++;
                continue;
            }
            if(!((cj>=0&&cj<=9)||(cj>=97&&cj<=122))){
                j--;
                continue;
            }
            if(ci==cj){
                i++;
                j--;
            }
            else return  false;
        }
        return  true;


    }
    public static void main(String[] args) {
      isPalindrome1("0P");
    }
}
