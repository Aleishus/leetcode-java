package stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_844 {

    public boolean backspaceCompare( String S, String T ) {
        return rm(S).equals(rm(T));
    }


    public String rm( String S ) {
        int i = 0;
        char[] stack = new char[S.length() + 1];
        for (char ch : S.toCharArray()) {
            if (ch == '#') {
                i--;
                continue;
            } else {
                if (i < 0) {
                    i = 0;
                }
                i++;
                stack[i] = ch;

            }
        }
        return new String(stack, 1, i);
    }

    public static void main( String[] args ) {
        System.out.println(new Solution_844().backspaceCompare("a#c","ad#c"));
    }
}
