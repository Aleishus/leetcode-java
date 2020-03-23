package arrays;

public class Solution_896 {

  public boolean isMonotonic(int[] A) {
    if (A.length <= 1) {
      return true;
    }
    int x = 0;
    int cur = 0;
    int j = 0;
    for (int i = 0; i + 1 < A.length; i++) {
      if (A[i] > A[i + 1]) {
        cur = 1;
        j++;
      } else if (A[i] < A[i + 1]) {
        cur = -1;
        j++;
      } else {
        continue;
      }
      if (j > 1 && cur != x) {
        return false;
      }
      x = cur;
    }
    return true;
  }
}
