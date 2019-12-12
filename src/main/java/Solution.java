import java.util.Random;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution {

    private int[] ref;
    private Random random = new Random();

    public Solution( int[] nums ) {
        ref = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return ref;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {

        int[] tmp = new int[ref.length];
        int[] copy = new int[ref.length];
        System.arraycopy(ref, 0, copy, 0, ref.length);
        for (int i = 0; i < tmp.length; i++) {
            int bound = tmp.length - i;
            int index = random.nextInt(bound);
            tmp[i] = copy[index];
            int t = copy[bound - 1];
            copy[bound - 1] = tmp[i];
            copy[index] = t;
        }
        return tmp;
    }

    public static void main( String... args ) {
        Random random = new Random();
        int[] x = {2, 4, 3, 6, 7, 9};
        Solution solution = new Solution(x);
        for (int i = 0; i < 5; i++) {
            int[] m = solution.shuffle();
            int[] p = solution.reset();
            for (int j = 0; j < x.length; j++) {
                System.out.print(m[j] + ",");
            }
            System.out.println();
            for (int j = 0; j < x.length; j++) {
                System.out.print(p[j] + ",");
            }
            System.out.println();
        }

    }
}

