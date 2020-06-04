package leetcode.handpicktop.level1.level1reviewday1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     14:31
 */
public class Fizz {
    //3的倍数 fizz 5的倍数 buzz 同时 FizzBuzz
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i = 1 ; i <= n ; i++){
                if(i%15 == 0) result.add("FizzBuzz");
                else if(i%3 == 0 ) result.add("Fizz");
                else if(i%5 == 0 ) result.add("Buzz");
                else result.add(String.valueOf(i));
        }
        return  result;
    }
}
