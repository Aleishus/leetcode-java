package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_299 {

    public String getHint( String secret, String guess ) {
        int A = 0;
        int B = 0;
        char[] secretA = secret.toCharArray();
        char[] guessA = guess.toCharArray();
        int[] back = new int[10];
        for (int i = 0; i < guessA.length; i++) {
            if (guessA[i] == secretA[i]) {
                A++;
                guessA[i] = 10;

            } else {
                back[secretA[i] - '0'] += 1;
            }
        }
        for (int i = 0; i < guessA.length; i++) {
            if (guessA[i] != 10) {
                if (( back[guessA[i] - '0'] -= 1 ) >= 0) {
                    B++;
                }
            }
        }

        return A + "A" + B + "B";

    }

    public static void main( String[] args ) {
        System.out.println(new Solution_299().getHint("1122","1222"));
    }
}
