package hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1002 {

    public List<String> commonChars( String[] A ) {
        int[] letters = new int[26];
        int[] tmp = new int[26];
        for (char c : A[0].toCharArray()) {
            letters[c - 'a'] += 1;
        }

        for (int i = 1; i < A.length; i++) {
            for (char c : A[i].toCharArray()) {
                tmp[c - 'a'] += 1;
            }
            for (int m = 0; m < letters.length; m++) {
                letters[m] = Math.min(letters[m], tmp[m]);
                tmp[m] = 0;
            }
        }
        List<String> res = new ArrayList<>();
        for (int n = 0; n < letters.length; n++) {
            for (int x = 0; x < letters[n]; x++) {
                res.add(String.valueOf((char) ( 'a' + n )));
            }

        }
        return res;
    }

    public static void main( String[] args ) {
        String[] m = {"bella", "label", "roller"};

        List<String> res = new Solution_1002().commonChars(m);
    }
}
