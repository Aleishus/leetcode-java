package stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_20 {

    public boolean isValid( String s ) {

        if (s.length() == 0) {
            return false;
        }
        int stackPointer = 0;
        char[] stack = new char[s.length() + 1];
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack[++stackPointer] = ch;

            } else if (ch == ')') {
                if (stack[stackPointer] != '(') {
                    return false;
                }
                stackPointer--;

            } else if (ch == '[') {
                stack[++stackPointer] = ch;

            } else if (ch == ']') {
                if (stack[stackPointer] != '[') {
                    return false;
                }
                stackPointer--;

            } else if (ch == '{') {
                stack[++stackPointer] = ch;


            } else if (ch == '}') {
                if (stack[stackPointer] != '{') {
                    return false;
                }
                stackPointer--;
            }
        }
        return stackPointer == 0;
    }

    public static void main( String[] args ) {
        System.out.println(new Solution_20().isValid("()"));
    }
}
