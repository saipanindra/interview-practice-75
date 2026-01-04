package stacks;

import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minState;
    int minSoFar;

    public MinStack() {
        mainStack = new Stack<>();
        minState = new Stack<>();
        minSoFar = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        minSoFar = minState.empty() ? Integer.MAX_VALUE : minState.peek();
        mainStack.push(val);
        if (val < minSoFar) {
            minSoFar = val;
        }
        minState.push(minSoFar);
        
    }
    
    public void pop() {
        mainStack.pop();
        minState.pop();
        
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minState.peek();
    }
    
}
