package arrays;

;

public class Solution_268 {

  public int missingNumber(int[] nums) {
    int sum = 0;
    for (int c : nums) {
      sum += c;
    }

    return (1 + nums.length) * (nums.length) / 2 - sum;
  }
  //todo 异或算法大方光彩
  //https://leetcode-cn.com/problems/missing-number/solution/que-shi-shu-zi-by-leetcode/
/*
    public int missingNumber(int[] nums) {
      int missing = nums.length;
      for (int i = 0; i < nums.length; i++) {
        missing ^= i ^ nums[i];
      }
      return missing;
    }*/




  public static void main(String[] args) {
    int[] nums ={9,6,4,2,3,5,7,0,1};
    System.out.println(new Solution_268().missingNumber(nums));
  }
}
