package leetcode.handpicktop.level1.level1reviewday3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    //栈
    public boolean isFit(Character c1, Character c2){
        return  (c1=='['&&c2==']')||(c1=='('&&c2==')')||(c1=='{'&&c2=='}');
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0 ; i<s.length() ; i++){
            Character c = s.charAt(i);
            if(stack.size()==0) stack.push(c);
            else if(isFit(stack.peek(),c)){
                stack.pop();
            }
            else{
               stack.push(c);
            }
        }
        return  stack.size()==0;
    }
}
