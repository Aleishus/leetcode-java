package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_771 {

    public int numJewelsInStones( String J, String S ) {
        int[] letters = new int[26 + 26 + 6];
        int sum = 0;
        for (char ch : J.toCharArray()) {
            letters[ch - 'A'] = 1;
        }
        for (char ch : S.toCharArray()) {
            if (letters[ch - 'A'] == 1) {
                sum++;
            }
        }

        return sum;
    }

    public static void main( String[] args ) {
        System.out.println((int) 'A');
    }

}
