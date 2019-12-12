package hashtable;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_575 {

    public int distributeCandies( int[] candies ) {
        int res = 0;
        int len = candies.length / 2;
        int i = 0;
        Set<Integer> hash = new HashSet<>(len);
        for (int c : candies) {
            if (!hash.contains(c) && i < len) {
                hash.add(c);
                i++;
                res++;
            }

        }
        return res;
    }

    public static void main( String[] args ) {
       int[]  candies = {1,1} ;
        System.out.println(new Solution_575().distributeCandies(candies));
    }
}
