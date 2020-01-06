package arrays;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class Solution_1299 {

  public int[] replaceElements(int[] arr) {

    int tmp = Integer.MIN_VALUE;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (tmp < arr[i]) {
        int t = arr[i];
        arr[i] = tmp;
        tmp = t;
      } else {
        arr[i] = tmp;
      }
    }
    arr[arr.length - 1] = -1;
    return arr;
  }


  public static void main(String[] args) {
    int[] arr = {17, 18, 5, 4, 6, 1};
    new Solution_1299().replaceElements(arr);
    System.out.println(Arrays.toString(arr));
  }
}
