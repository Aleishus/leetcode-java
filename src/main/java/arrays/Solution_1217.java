package arrays;

public class Solution_1217 {

  public int minCostToMoveChips(int[] chips) {
    int m = chips[0];
    int cur = m;
    int count = 0;
    for (int i = 1; i < chips.length; i++) {
      if (cur != chips[i]) {
        cur = chips[i];
        if (Math.abs(cur - m) % 2 == 1) {
          count++;
        }
      }

    }
    return count;

  }
}
