package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1160 {

    public int countCharacters( String[] words, String chars ) {
        int[] letters = new int[26];
        int[] tmp = new int[26];
        int len = 0;
        for (char c : chars.toCharArray()) {
            letters[c - 'a'] += 1;
        }

        L:
        for (String word : words) {
            System.arraycopy(letters, 0, tmp, 0, 26);
            for (char c : word.toCharArray()) {
                if (tmp[c - 'a'] - 1 < 0) {
                    continue L;
                } else {
                    tmp[c - 'a'] -=1;
                }
            }
            len += word.length();
        }

        return len;
    }

    public static void main( String[] args ) {
        String[] words = {"leetcode", "hello", "leetcode"};

        System.out.println(new Solution_1160().countCharacters(words, "welldonehoneyr"));
    }
}
