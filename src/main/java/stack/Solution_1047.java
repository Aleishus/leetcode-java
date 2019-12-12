package stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1047 {

    public String removeDuplicates( String S ) {
        int i = 0;

        char[] stack = new char[S.length()+1];
        for (char ch : S.toCharArray()) {
            if (ch == stack[i]) {
                i--;
                continue;
            } else {
                i++;
                stack[i] = ch;

            }
        }

        return new String(stack, 1, i );

    }

    public static void main( String[] args ) {
        System.out.println(new Solution_1047().removeDuplicates("ab"));
    }
}
