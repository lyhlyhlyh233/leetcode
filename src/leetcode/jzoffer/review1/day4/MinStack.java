package leetcode.jzoffer.review1.day4;

import java.util.LinkedList;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/11     17:26
 */
public class MinStack {
    LinkedList<Integer> stack;
    LinkedList<Integer> minStack;
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }
    public void push(int x) {
        stack.addLast(x);
        if(minStack.size()>0){
            int min = minStack.getLast();
            if(x<=min){
                minStack.addLast(x);
            }
        }
        else {
            minStack.addLast(x);
        }
    }
    public void pop() {
        if(stack.size()==0) return;
        int value = stack.getLast();
        if(value==minStack.getLast()){
                minStack.removeLast();
        }
        stack.removeLast();
    }

    public int top() {
        return  stack.getLast();
    }

    public int min() {
        return  minStack.getLast();
    }
}
