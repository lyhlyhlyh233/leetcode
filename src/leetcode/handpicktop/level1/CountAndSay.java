package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/20     15:11
 */

/**
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 *
 * 注意：整数序列中的每一项将表示为一个字符串。
 */
public class CountAndSay {
    public String trans(String s){
        if(s.length()<2) return "11";
        String result = "";
        char[] chars = s.toCharArray();
        int i = 0;
        int j = 1;
        while(j!=chars.length){
            if(chars[j]==chars[i]) j++;
            else{
                int count = j-i;
                result+= ((j-i)+""+chars[i]);
                i = j ;
                j++;
            }
        }
        int count = j-i;
        result+= ((j-i)+""+chars[i]);
        return  result;
    }
    public String countAndSay(int n) {
            String s = "1";
            for(int i = 0 ; i< n-1 ; i++){
                s = trans(s);
              }
        return  s;
    }

    public static void main(String[] args) {
      String s =   new CountAndSay().countAndSay(5);
        System.out.println(s);
    }
}
