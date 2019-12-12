package stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1021 {

    public String removeOuterParentheses( String S ) {
        StringBuilder res = new StringBuilder(S.length());
        int stackSize = 0;
        int len = 0;
        char[] s = S.toCharArray();
        for (int i = 0; i < s.length; i++) {
            len++;
            if (s[i] == '(') {
                stackSize++;
            }
            if (s[i] == ')') {
                stackSize--;
            }

            if (stackSize == 0) {
                if (len > 2) {
                    res.append(S, i - len + 2, i);
                }
                len = 0;
            }
        }

        return res.toString();
    }

    public static void main( String[] args ) {
        System.out.println(new Solution_1021().removeOuterParentheses("(()())(())(()(()))"));
    }
}
