package arrays;

import java.util.Arrays;

public class Solution_27 {

    public int removeElement( int[] nums, int val ) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != val) {
                i++;
            } else {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                if (nums[i] != val) {
                    i++;
                }
            }
        }
        return i;
    }

    public static void main( String[] args ) {
        int[] nums = {0, 1, 2, 2, 2, 3, 0, 4, 2, 2};
        System.out.println(new Solution_27().removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }
}
