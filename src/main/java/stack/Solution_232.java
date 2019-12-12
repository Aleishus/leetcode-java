package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_232 {


    //todo 使用两个栈就可以解决，尝试 pop 和push 都在O(1)的时间度完成

    private Stack<Integer> stackA;
    private Stack<Integer> stackB;
    private Stack<Integer> stackC;
    private Stack<Integer> cur;


    public Solution_232() {
        stackA = new Stack<>();
        stackB = new Stack<>();
        stackC = new Stack<>();

    }

    /**
     * Push element x to the back of queue.
     */
    public void push( int x ) {
        stackA.push(x);

        while (stackB.size() > 0) {
            stackC.push(stackB.pop());
        }
        while (stackC.size() > 0) {
            stackA.push(stackC.pop());
        }
        cur = stackA;
        stackA = stackC;
        stackC = stackB;
        stackB = cur;
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return cur.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return cur.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return cur.empty();
    }

    public static void main( String[] args ) {

        Solution_232 a = new Solution_232();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.empty());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.empty());

    }

}
