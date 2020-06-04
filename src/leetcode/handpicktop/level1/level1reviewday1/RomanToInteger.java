package leetcode.handpicktop.level1.level1reviewday1;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     14:52
 */

import java.util.HashMap;

/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 */
public class RomanToInteger {
    private HashMap<String,Integer> dict = new HashMap<>();
    private void init(){
        dict.put("I",1);
        dict.put("V",5);
        dict.put("X",10);
        dict.put("L",50);
        dict.put("C",100);
        dict.put("D",500);
        dict.put("M",1000);
        dict.put("IV",4);
        dict.put("IX",9);
        dict.put("XL",40);
        dict.put("XC",90);
        dict.put("CD",400);
        dict.put("CM",900);
    }
    public int romanToInt(String s) {
            init();
            Integer total = 0;
            for(int i = 0 ; i <  s.length() ; i++){
                String s1 = s.charAt(i)+"";
                Integer t1 = dict.get(s1);
                if(i!=s.length()-1){
                    String s2 = s.charAt(i+1)+"";
                    Integer t2 = dict.get(s2);
                    if(t1<t2){
                          total+=(t2-t1);
                          i++;continue;
                    }
                }
                total +=t1;
            }
            return  total;
    }
}
