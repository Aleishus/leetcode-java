package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_349 {

    public int[] intersection( int[] nums1, int[] nums2 ) {
        Set<Integer> s = new HashSet<>(nums1.length);
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            s.add(i);
        }
        for (int i : nums2) {
            if (s.contains(i)) {
                res.add(i);
            }
        }
        int[] ret = new int[res.size()];
        int i = 0;
        for (Integer m : res) {
            ret[i] = m;
            i++;
        }
        return ret;
    }
}
