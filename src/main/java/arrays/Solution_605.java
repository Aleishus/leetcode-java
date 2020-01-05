package arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_605 {

    public boolean canPlaceFlowers( int[] flowerbed, int n ) {
        int count = 1;
        for (int c : flowerbed) {
            if (c == 0) {
                count++;
            } else {
                count = 0;
            }

            if (count == 3) {
                n--;
                count = 1;
            }
            if (n == 0) {
                return true;
            }
        }
        if (count == 2) {
            n--;
        }
        return n <= 0;
    }

    public static void main( String[] args ) {
        int [] ss={1,0,0,0,1,0,0};
        System.out.println(new Solution_605().canPlaceFlowers(ss,2));
    }

}
