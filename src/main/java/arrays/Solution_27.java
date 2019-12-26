package arrays;

import java.util.Arrays;

public class Solution_27 {

  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      if (nums[0] != val) {
        return 1;
      }
    }

    int i = 0;
    int sum = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] == val) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        if (nums[i] != val) {
          i++;
        }
      } else {
        i++;
      }
    }
    return i;
  }

  public static void main(String[] args) {
    int[] nums = {2,2};
    System.out.println(new Solution_27().removeElement(nums, 3));
    System.out.println(Arrays.toString(nums));
  }
}
