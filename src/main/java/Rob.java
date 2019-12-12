import java.util.Arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Rob {

    public int rob( int[] nums ) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        } else {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = nums[1];
            int dpMax = dp[0] > dp[1] ? dp[0] : dp[1];
            for (int i = 2; i < nums.length; i++) {
                int max = -1;
                for (int j = 0; j < i - 1; j++) {
                    if (dp[j] > max) {
                        max = dp[j];
                    }

                }
                dp[i] = nums[i] + max;
                if (dp[i] > dpMax) {
                    dpMax = dp[i];
                }
            }
            return dpMax;
        }
    }

    public static void main( String[] args ) {
        Rob r = new Rob();
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(r.rob(nums));
    }

}
