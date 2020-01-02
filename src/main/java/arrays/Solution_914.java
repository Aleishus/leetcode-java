package arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_914 {

    public boolean hasGroupsSizeX( int[] deck ) {
        int[] map = new int[10000];
        for (int i = 0; i < deck.length; i++) {
            map[deck[i]]++;
        }
        int i = 0;
        int gcd = 1;
        for (; i < map.length; i++) {
            if (map[i] != 0) {
                gcd = map[i];
                if (gcd == 1) {
                    return false;
                }
                break;
            }
        }
        i++;
        for (; i < map.length; i++) {
            if (map[i] != 0) {
                gcd = gcd(map[i], gcd);
                if (gcd == 1) {
                    return false;
                }
            }
        }

        return true;
    }

 //todo 求最大公约数
    private int gcd( int i, int j ) {
        int m = i, n = j;
        if (i < j) {
            m = j;
            n = i;
        }
        int t = 1;
        while (t != 0) {
            t = m % n;
            m = n;
            n = t;
        }
        return m;
    }


    public static void main( String[] args ) {
        int[] nums = {1};

        System.out.println(new Solution_914().hasGroupsSizeX(nums));
    }
}
