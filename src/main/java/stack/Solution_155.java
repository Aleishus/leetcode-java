package stack;

import java.util.Stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_155 {


    Stack<Integer> value;
    Stack<Integer> min;

    /**
     * initialize your data structure here.
     */
    public Solution_155() {
        value = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push( int x ) {
        if (x <= min.peek()) {
            min.push(x);
        }
        value.push(x);
    }

    public void pop() {
        int x = value.pop();
        if (x == min.peek()) {
            min.pop();
        }

    }

    public int top() {
        return value.peek();

    }

    public int getMin() {
        return min.peek();
    }

    public static void main( String[] args ) {
        System.out.println(Integer.MAX_VALUE);
    }
}
