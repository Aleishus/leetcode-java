package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_136 {

    public int singleNumber( int[] nums ) {

        int res = 0;

        for (int i : nums) {
            res ^= i;
        }
        return res;

    }
}
