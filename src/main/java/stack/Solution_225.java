package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_225 {


    List<Integer> queue;
    int stackPointer;

    /**
     * Initialize your data structure here.
     */
    public Solution_225() {
        queue = new ArrayList<>(10);
        stackPointer = -1;
    }

    /**
     * Push element x onto stack.
     */
    public void push( int x ) {
        queue.add(++stackPointer, x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.get(stackPointer--);
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.get(stackPointer);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return stackPointer == -1;
    }
}
