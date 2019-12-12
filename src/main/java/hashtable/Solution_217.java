package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_217 {

    public boolean containsDuplicate( int[] nums ) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
