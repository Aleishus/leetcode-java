import java.util.Arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class LengthOfLIS {


    public int lengthOfLIS( int[] nums ) {
        int[] memo = new int[nums.length];
        int x = findMemo(nums, Integer.MIN_VALUE, -1, 0, memo);
        // return find(nums,Integer.MIN_VALUE,0);
        return x;
    }


    public int find( int[] nums, int pre, int pos ) {

        if (pos == nums.length) {
            return 0;
        }
        System.out.print(nums[pos]);

        int taken = 0;
        if (nums[pos] > pre) {
            taken = 1 + find(nums, nums[pos], pos + 1);
        }
        int notTaken = find(nums, pre, pos + 1);
        return Math.max(taken, notTaken);
    }


    public int findMemo( int[] nums, int pre, int prePos, int pos, int[] memo ) {

        if (pos == nums.length) {
            return 0;
        }
        int taken = 0;
        if (prePos != -1 && memo[prePos] != 0) {
            return memo[prePos];
        }
        if (nums[pos] > pre) {
            taken = 1 + findMemo(nums, nums[pos], pos, pos + 1, memo);
        }
        int notTaken = findMemo(nums, pre, prePos, pos + 1, memo);
        int max = Math.max(taken, notTaken);
        if (prePos != -1) {
            memo[prePos] = max;
        }
        return max;
    }


    public static void main( String[] args ) {
        LengthOfLIS lengthOfLIS = new LengthOfLIS();
        int[] nums = {10,9,2,5,3,7,101,18};
        int x = lengthOfLIS.lengthOfLIS(nums);
        System.out.println();
        System.out.println(x);
    }
}
