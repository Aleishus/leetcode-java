package sort;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_922 {

    public int[] sortArrayByParityII( int[] A ) {
        int evenIndex = 0;
        int oddIndex = 1;
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (( A[i] & 1 ) == 1) {
                res[oddIndex] = A[i];
                oddIndex += 2;
            } else {
                res[evenIndex] = A[i];
                evenIndex += 2;
            }
        }
        return res;
    }

}
