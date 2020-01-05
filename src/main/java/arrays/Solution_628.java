package arrays;

public class Solution_628 {

  public int maximumProduct(int[] nums) {

    int a = -1001;
    int b = a;
    int c = a;

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
    }
    return 0;

  }
  //todo 求5个数 最小两个和最大三个

  public static void main(String[] args) {
   int [] nums =  {-4,-3,-2,-1,60} ;
    System.out.println(new Solution_628().maximumProduct(nums));
  }
}
