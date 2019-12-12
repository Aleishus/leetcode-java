/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MaxSubArray {

    public int maxSubArray( int[] nums ) {
        int max = nums[0];
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= ( pre + nums[i] )) {
                pre = nums[i];
            } else {
                pre = ( pre + nums[i] );
            }
            if (pre > max) {
                max = pre;
            }
        }

        return max;
    }

    public static void main( String[] args ) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSubArray().maxSubArray(nums));
    }
}
