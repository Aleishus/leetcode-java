package hashtable;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_290 {

    public boolean wordPattern( String pattern, String str ) {
        int[] map = new int[26];
        Set<String> strSet = new HashSet<>(str.length());
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder(str.length());
        char[] pCh = pattern.toCharArray();
        if (pCh.length != words.length) {
            return false;
        }
        for (int i = 0; i < pCh.length; i++) {

            if (map[pCh[i] - 'a'] == 0 && !strSet.contains(words[i])) {
                map[pCh[i] - 'a'] = i + 1;
                strSet.add(words[i]);
            }
            int x = map[pCh[i] - 'a'] - 1;
            if (x < 0) {
                return false;
            }
            sb.append(words[x]);
            if (i < pCh.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString().equals(str);
    }

    public static void main( String[] args ) {
        System.out.println(new Solution_290().wordPattern("abba", "fuck dog dog fuck"));
    }
}
