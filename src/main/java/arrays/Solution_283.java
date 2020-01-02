package arrays;

import java.util.Arrays;

public class Solution_283 {

  public void moveZeroes(int[] nums) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      int tmp = nums[j];
      if (tmp != 0) {
        nums[j] = 0;
        nums[i++] = tmp;

      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {0,1};
    new Solution_283().moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }
}
