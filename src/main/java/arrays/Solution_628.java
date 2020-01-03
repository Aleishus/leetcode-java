package arrays;

public class Solution_628 {

  public int maximumProduct(int[] nums) {

    int a = -1001;
    int b = a;
    int c = a;
    int multiply = Integer.MIN_VALUE;

    for (int n : nums) {
      if (n > a) {
        c = b;
        b = a;
        a = n;
      } else if (n > b) {
        c = b;
        b = n;
      } else if (n > c) {
        c = n;
      }
      int x = a * b * c;
      if (x > multiply) {
        multiply = x;
      }
    }
    return multiply;

  }

  public static void main(String[] args) {
   int [] nums =  {-4,-3,-2,-1,60} ;
    System.out.println(new Solution_628().maximumProduct(nums));
  }
}
