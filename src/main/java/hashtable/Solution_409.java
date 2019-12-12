package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_409 {

    public int longestPalindrome( String s ) {
        int sum = 0;
        int[] letters = new int[26 + 26 + 6];
        for (char ch : s.toCharArray()) {
            letters[ch - 'A'] += 1;
        }
        for (int m : letters) {
            int x = m / 2;
            if (x > 0) {
                sum += 2 * x;
            }
        }
        if (sum + 1 <= s.length()) {
            sum += 1;
        }
        return sum;
    }
}
