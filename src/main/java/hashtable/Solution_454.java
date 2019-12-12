package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_454 {

    public int fourSumCount( int[] A, int[] B, int[] C, int[] D ) {
        Map<Integer, Integer> searchMap = new HashMap<Integer, Integer>(A.length * B.length);
        int m = 0;
        for (int i : A) {
            for (int j : B) {
                int x = i + j;
                if (searchMap.containsKey(x)) {
                    searchMap.put(x, searchMap.get(x) + 1);
                } else {
                    searchMap.put(x, 1);
                }
            }
        }
        for (int i : C) {
            for (int j : D) {
                int x = -( i + j );
                Integer y = searchMap.get(x);
                if (y != null) {
                    m += y;
                }
            }
        }
        return m;
    }

}
