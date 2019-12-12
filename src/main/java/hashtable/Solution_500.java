package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_500 {

    public String[] findWords( String[] words ) {
        List<String> res = new ArrayList<>();
        int[] back = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
        L:
        for (String word : words) {
            char[] chs = word.toLowerCase().toCharArray();
            for (int i = 0, j = 1; i < chs.length - 1; i++, j++) {
                if (back[chs[i] - 'a'] != back[chs[j] - 'a']) {
                    continue L;
                }
            }
            res.add(word);
        }

        return res.toArray(new String[res.size()]);
    }

    public static void main( String[] args ) {
        String[] A = {"abdfs","cccd","a","qwwewm"};
        String[] res = new Solution_500().findWords(A);
    }
}
