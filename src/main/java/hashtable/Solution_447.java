package hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_447 {


    public int numberOfBoomerangs( int[][] points ) {
        int res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            hashMap.clear();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int d = ( points[i][0] - points[j][0] ) * ( points[i][0] - points[j][0] )
                        + ( points[i][1] - points[j][1] ) * ( points[i][1] - points[j][1] );
                if (hashMap.containsKey(d)) {
                    res += hashMap.get(d) * 2;
                    hashMap.put(d, hashMap.get(d) + 1);
                } else {
                    hashMap.put(d, 1);
                }
            }
        }

        return res;
    }


    public static void main( String[] args ) {
        int[][] x = {{0, 0}, {1, 0}, {2, 0}};
        System.out.println(new Solution_447().numberOfBoomerangs(x));
    }

}
