package arrays;

import java.util.Arrays;
import sun.lwawt.macosx.CSystemTray;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_66 {

    public int[] plusOne( int[] digits ) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {

            digits[i] += carry;
            int x = digits[i] - 10;
            if (x >= 0) {
                digits[i] = x;
                if (i == 0) {
                    int[] array = new int[digits.length + 1];
                    array[0] = carry;
                    System.arraycopy(digits, 0, array, 1, digits.length);
                    digits = array;
                }
                continue;
            }
            break;
        }

        return digits;
    }

    public static void main( String[] args ) {
        int[] ss = {9, 8, 9, 9};
        System.out.println(Arrays.toString(new Solution_66().plusOne(ss)));
    }
}
