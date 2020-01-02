package arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution_169 {

  public int majorityElement(int[] nums) {

    int count = nums.length / 2;
    int[] maps = new int[count + 1];

    for (int i : nums) {
      int hash = (i ^ i >>> 16) % maps.length;
      int len = maps[hash] + 1;
      if (len > count) {
        return i;
      }
      maps[hash] = len;
    }

    return 0;
  }


  // todo 摩尔投票算法 O(n)+O(1)
/*
  public int majorityElement(int[] nums) {
    int count = 0;
    Integer candidate = null;

    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }
      count += (num == candidate) ? 1 : -1;
    }

    return candidate;
  }*/





  public static void main(String[] args) {
    int[] nums = {-1,1,1,1,2,1};
    System.out.println(new Solution_169().majorityElement(nums));
  }
}
