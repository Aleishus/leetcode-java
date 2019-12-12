package hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_645 {

    public int[] findErrorNums( int[] nums ) {
//        Set<Integer> set = new HashSet<>(nums.length);
//        int sum = 0;
//        int repeat = -1;
//        for (int i : nums) {
//            sum += i;
//
//            if (set.contains(i)) {
//                repeat = i;
//            }
//            set.add(i);
//        }
//
//        int r = ( 1 + nums.length ) * nums.length / 2 -sum + repeat;
//
//        int[] res = {repeat, r};
//        return res;

        Arrays.sort(nums);
        int rep = -1;
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
             sum +=nums[i];
            if (nums[i] == nums[i + 1]) {
                rep = nums[i];
            }

        }
        sum+=nums[nums.length-1];

        int r = ( 1 + nums.length ) * nums.length / 2 -sum + rep;
        return new int[]{rep, r};

    }

    public static void main( String[] args ) {

        int[] r = new Solution_645().findErrorNums(new int[]{1, 1});
    }
}
