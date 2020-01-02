package arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_414 {

    public int thirdMax( int[] nums ) {
        int one = Integer.MIN_VALUE;
        int two = one;
        int three = two;
        int tmp = 0;
        for (int c : nums) {
            if (c >= one) {
                if (c == one) {
                    continue;
                }
                tmp = one;
                one = c;
                three = two;
                two = tmp;
            } else if (c >= two) {
                if (c == two) {
                    continue;
                }
                tmp = two;
                two = c;
                three = tmp;
            } else if (c >= three) {
                if (c == three) {
                    continue;
                }
                three = c;
            }
        }

        return two > three && nums.length > 2 ? three : one;
    }

    public static void main( String[] args ) {
        int[] nums = {1, 5, 5};
        System.out.println(new Solution_414().thirdMax(nums));
    }
}
