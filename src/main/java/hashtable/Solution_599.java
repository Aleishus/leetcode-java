package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_599 {

    public String[] findRestaurant( String[] list1, String[] list2 ) {
        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>(list1.length);
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            Integer x = map.get(list2[i]);
            if (x != null) {
                int m = x + i;
                if (m < min) {
                    res.clear();
                    res.add(list2[i]);
                    min = m;
                } else if (m == min) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main( String[] args ) {

        String[] res = new Solution_599().findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"});
    }
}
