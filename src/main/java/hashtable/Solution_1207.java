package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1207 {

    public boolean uniqueOccurrences( int[] arr ) {
        Map<Integer, Integer> p1 = new HashMap<>(arr.length);
        for (int i : arr) {
            Integer t = p1.get(i);
            if (t == null) {
                p1.put(i, 1);
            } else {
                p1.put(i, t + 1);
            }
        }

        HashSet<Integer> set = new HashSet<>(p1.size());

        for (int i : p1.values()) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}
