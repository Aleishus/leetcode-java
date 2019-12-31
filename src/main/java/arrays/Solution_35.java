package arrays;

public class Solution_35 {

  public int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] > target) {
        high = mid - 1;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
    return low;
  }

  public static void main(String[] args) {
    int[] nums = {1};
    System.out.println(new Solution_35().searchInsert(nums, 2));
  }
}
