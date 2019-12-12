package dynamicprograming;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_20 {

    public int climbStairs( int n ) {
        if (n == 0) {
            return 0;
        }
        return re(n);
    }


    private int re( int n ) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (( n - 1 ) >= 0) {
            return re(n - 1) + re(n - 2);
        }
        return 0;
    }


    public int sp( int n ) {
        if (n <= 2) {
            return n;
        }
        int max = 2;
        int p = 1, q = 2;
        for (int i = 3; i <= n; i++) {
            max = p + q;
            p = q;
            q = max;
        }
        return max;
    }


    public static void main( String[] args ) {
        System.out.println(new Solution_20().climbStairs(4));
        System.out.println(new Solution_20().sp(4));
    }

}
