package arrays;

import java.util.Arrays;

public class Solution_997 {

  public int[] sortedSquares(int[] A) {

    int[] res = new int[A.length];
    int i = 0;
    int j = A.length - 1;

    for (int n = j; n >= 0; n--) {
      int p = Math.abs(A[j]);
      int q = Math.abs(A[i]);
      if (p > q) {
        j--;
        res[n] = p * p;
      } else {
        i++;
        res[n] = q * q;
      }
    }
    return res;

  }

  public static void main(String[] args) {
    int[] nums = {-7,-3};

    System.out.println(Arrays.toString(new Solution_997().sortedSquares(nums)));
  }
}
