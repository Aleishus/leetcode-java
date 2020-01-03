package arrays;

import java.util.Arrays;

public class Solution_516 {
  //todo 有时间研究下方法三 https://leetcode-cn.com/problems/array-partition-i/solution/shu-zu-chai-fen-i-by-leetcode/

  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length; i += 2) {
      sum += nums[i];
    }
    return sum;
  }
}
