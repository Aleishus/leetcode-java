package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_242 {

    public boolean isAnagram( String s, String t ) {

        int[] letters = new int[26];
        for (char ch : s.toCharArray()) {
            letters[ch - 'a'] += 1;
        }
        for (char ch : t.toCharArray()) {
            if (( letters[ch - 'a'] -= 1 ) < 0) {
                return false;
            }
        }

        return true;
    }
}
