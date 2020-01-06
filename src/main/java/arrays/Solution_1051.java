package arrays;

import java.util.Arrays;

public class Solution_1051 {

  //todo 使用hash 表 使用桶排序 https://leetcode-cn.com/problems/height-checker/solution/onjie-fa-yong-shi-yu-nei-cun-ji-bai-100-javayong-h/

  public int heightChecker(int[] heights) {
    int[] copy = new int[heights.length];
    for (int i = 0; i < copy.length; i++) {
      copy[i] = heights[i];
    }
    Arrays.sort(copy);
    int count = 0;

    for (int i = 0; i < copy.length; i++) {
      if (copy[i] != heights[i]) {
        count++;
      }
    }

    return count;
  }
}
