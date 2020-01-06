package arrays;

import java.util.Arrays;

public class Solution_1304 {

  public int[] sumZero(int n) {
    int[] res = new int[n];
    int z = n % 2;
    int j = 0;
    for (int i = 1; i <= n / 2; i++) {
      res[j] = i;
      j++;
      res[j] = -i;
      j++;
    }
    if (z == 1) {
      res[n - 1] = 0;
    }

    return res;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution_1304().sumZero(5)));
  }
}
