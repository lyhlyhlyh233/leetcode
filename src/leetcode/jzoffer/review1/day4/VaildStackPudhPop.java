package leetcode.jzoffer.review1.day4;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     18:00
 */
public class VaildStackPudhPop {
    static Deque<Integer> pushStack = new ArrayDeque<>();
    static Deque<Integer> popStack = new ArrayDeque<>();

    public static  boolean validate(int[] pushed,int i,Deque<Integer> popStack){
        //if(popStack.size()==0) return  true;
        //相等或i==push[]则pop
        while((pushStack.size()>0&&popStack.size()>0&&popStack.peek().equals(pushStack.peek()))){
            popStack.pop();
            pushStack.pop();
            if(popStack.size()==0) return  true;
        }
        //否则就push
       // if(i==pushed.length) return  false;
        pushStack.push(pushed[i]);
        return  validate(pushed,i+1,popStack);

    }
    public  static boolean validateStackSequences(int[] pushed, int[] popped) {
            for(int i = popped.length-1 ; i>=0; i--){
                popStack.push(popped[i]);
            }
            return  validate(pushed,0,popStack);
    }

    public static void main(String[] args) {
        validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1});
    }
}
