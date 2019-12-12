package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_205 {

    public boolean isIsomorphic( String s, String t ) {
        int[] ms = new int[26];
        int[] mt = new int[26];
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            int x = ms[s1[i] - 'a'];
            int y = mt[s2[i] - 'a'];
            if (x != y) {
                return false;
            }
            ms[s1[i] - 'a'] = x + i + 1;
            mt[s2[i] - 'a'] = y + i + 1;

        }
        return true;
    }

    public static void main( String[] args ) {
        new Solution_205().isIsomorphic("egg", "add");
    }
}
