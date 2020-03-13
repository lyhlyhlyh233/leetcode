package leetcode.handpicktop.level1;

/**
 * @Author :   lyh
 * @Dtae :     2020/3/12     10:35
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 写一个程序，输出从 1 到 n 数字的字符串表示。

 1. 如果 n 是3的倍数，输出“Fizz”；     11    110   1001  1100   1111

 2. 如果 n 是5的倍数，输出“Buzz”；  101

 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3,"Fizz");
        linkedHashMap.put(5,"Buzz");
        for(int i = 1    ; i<=n ;i++) {
                String s= "";
                for(Integer k : linkedHashMap.keySet()){
                    if(i%k==0){
                        s += linkedHashMap.get(k);
                    }
                }
                if(s.length()==0)
                     s=String.valueOf(i);
                list.add(s);
        }
        return  list;
    }
}
