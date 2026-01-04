package stacks;

public class MinStackTester {
    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(-2);
        m.push(0);
        m.push(-3);
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.top());
        System.out.println(m.getMin());
        m.push(2);
        m.push(-4);
        m.push(3);
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.top());
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.top());
        System.out.println(m.getMin());
    }
    
}
