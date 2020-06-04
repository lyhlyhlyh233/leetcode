package leetcode.handpicktop.level1.level1reviewday2;

import java.util.ArrayList;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/4     14:28
 */
public class MinStack {
    ArrayList<Integer> stack;
    //用一个栈记录元素的坐标
    ArrayList<Integer> stackMin;
    public MinStack() {
        stack = new ArrayList<>();
        stackMin = new ArrayList<>();
        stackMin.add(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.add(x);
        if(x<=stackMin.get(stackMin.size()-1)){
            stackMin.add(x);
        }
    }

    public void pop() {
        Integer popvalue = stack.get(stack.size()-1);
        if(popvalue.equals(stackMin.get(stackMin.size()-1))){//如果弹出的是最小值
            stackMin.remove(stackMin.size()-1);
        }
        stack.remove(stack.size()-1);
    }

    public int top() {
        return  stack.get(stack.size()-1);
    }
//在常数时间内检索出最小元素
    public int getMin() {
        return stackMin.get(stackMin.size()-1);
    }
}
