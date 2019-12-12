package sort;

import java.util.Arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_976 {

    public int largestPerimeter( int[] A ) {

        Arrays.sort(A);
        for (int i = A.length - 1; i - 2 >= 0; i--) {
            if (A[i - 1] + A[i - 2] > A[i]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }

        return 0;

    }
}
