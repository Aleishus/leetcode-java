package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_961 {

    public int repeatedNTimes( int[] A ) {
        int mid = A.length / 2;
        Set<Integer> back = new HashSet<>(mid + 1);
        for (int i = 0, j = mid; i <= mid - 1; i++, j++) {
            if (back.contains(A[j])) {
                return A[j];
            }
            if (back.contains(A[i])) {
                return A[i];
            }
            if (A[i] == A[j]) {
                return A[i];
            }
            back.add(A[i]);
            back.add(A[j]);
        }
        // 不可能
        return 0;
    }
}
