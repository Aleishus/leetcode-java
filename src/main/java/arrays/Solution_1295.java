package arrays;

public class Solution_1295 {

  public int findNumbers(int[] nums) {
    int count = 0;
    for (int c : nums) {
      if (c >= 10 && c < 99) {
        count++;
      } else if (c >= 1000 && c < 9999) {
        count++;
      }
    }

    return count;
  }
}
