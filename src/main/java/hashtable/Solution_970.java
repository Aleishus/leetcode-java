package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_970 {

    public List<Integer> powerfulIntegers( int x, int y, int bound ) {
        HashSet<Integer> res = new HashSet<>();
        HashMap<Integer, Integer> back = new HashMap<>();
        int m, n;
        if (x == 1) {
            m = 0;
        } else {
            m = (int) ( Math.log(bound) / Math.log(x) );
        }
        if (y == 1) {
            n = 0;
        } else {
            n = (int) ( Math.log(bound) / Math.log(y) );
        }
        for (int i = 0; i <= m; i++) {
            int p = (int) Math.pow(x, i);
            for (int j = 0; j <= n; j++) {
                int q = back.getOrDefault(j, 0);
                if (q == 0) {
                    q = (int) Math.pow(y, j);
                    back.put(j, q);
                }
                int o = p + q;
                if (o <= bound) {
                    res.add(o);
                }
            }
        }

        return new ArrayList<>(res);


    }

    public static void main( String[] args ) {
        List<Integer> res = new Solution_970().powerfulIntegers(2, 1, 10);
    }
}
