package hashtable;

import java.util.HashMap;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_219 {

    public boolean containsNearbyDuplicate( int[] nums, int k ) {

        HashMap<Integer, Integer> maps = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            Integer m = maps.get(nums[i]);
            if (null != m) {
                if (i - m <= k) {
                    return true;
                }
            }
            maps.put(nums[i], i);
        }
        return false;
    }

}
