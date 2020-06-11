package leetcode.jzoffer.review1.day3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/10     16:32
 */
public class IntegerString {
//    public static boolean isNumber(String s) {
//        Map[] states = {
//                new HashMap<String,Integer>() {{ put(' ', 0); put('s', 1); put('d', 2); put('.', 4); }}, // 0.
//                new HashMap<String,Integer>() {{ put('d', 2); put('.', 4); }},                           // 1.
//                new HashMap<String,Integer>() {{ put('d', 2); put('.', 3); put('e', 5); put(' ', 8); }}, // 2.
//                new HashMap<String,Integer>() {{ put('d', 3); put('e', 5); put(' ', 8); }},              // 3.
//                new HashMap<String,Integer>() {{ put('d', 3); }},                                        // 4.
//                new HashMap<String,Integer>() {{ put('s', 6); put('d', 7); }},                           // 5.
//                new HashMap<String,Integer>() {{ put('d', 7); }},                                        // 6.
//                new HashMap<String,Integer>() {{ put('d', 7); put(' ', 8); }},                           // 7.
//                new HashMap<String,Integer>() {{ put(' ', 8); }}                                         // 8.
//        };
//        int p = 0;
//        char t;
//        for(char c : s.toCharArray()) {
//            if(c >= '0' && c <= '9') t = 'd';
//            else if(c == '+' || c == '-') t = 's';
//            else t = c;
//            if(!states[p].containsKey(t)) return false;
//            p = (int)states[p].get(t);
//        }
//        return p == 2 || p == 3 || p == 7 || p == 8;
//    }

    public static void main(String[] args) {
      //  isNumber("46.e3");
    }
}
