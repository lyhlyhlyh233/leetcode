package leetcode.jzoffer.review1.day2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/9     10:26
 */
public class ImplQueneWithTwoStack {
        private Deque<Integer> stack1;
        private  Deque<Integer> stack2;
        public ImplQueneWithTwoStack() {
                stack1 = new ArrayDeque<>();
                stack2 = new ArrayDeque<>();
        }

        public void appendTail(int value) {//入列
            while(stack1.size()>0){
                stack2.push(stack1.pop());
            }
            stack1.push(value);
            while(stack2.size()>0){
                stack1.push(stack2.pop());
            }
        }

        public int deleteHead() {
            return    stack1.size()==0?-1:stack1.pop();
        }
}
