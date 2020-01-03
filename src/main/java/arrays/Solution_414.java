package arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_414 {


  public int thirdMax(int[] nums) {
    boolean flag = false;
    int[] sub = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    for (int c : nums) {
      if (c == Integer.MIN_VALUE) {
        flag = true;
      }
      if (c == sub[0] || c == sub[1] || c == sub[2]) {
        continue;
      }
      if (c > sub[0]) {
        swap(sub, 1, 2);
        swap(sub, 0, 1);
        sub[0] = c;
      } else if (c > sub[1]) {
        swap(sub, 1, 2);
        sub[1] = c;
      } else if (c > sub[2]) {
        sub[2] = c;
      }
    }
    if (flag) {
      return sub[1] > sub[2] ? sub[2] : sub[0];
    }
    return sub[2] == Integer.MIN_VALUE ? sub[0] : sub[2];

  }

  private void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 1};
    System.out.println(new Solution_414().thirdMax(nums));
  }
}
