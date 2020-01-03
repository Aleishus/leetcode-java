package arrays;

public class Solution_509 {

  public int fib(int N) {
    if (N == 0) {
      return 0;
    }
    if (N == 1) {
      return 1;
    }
    int a = 0, b = 1;
    for (int i = 2; i <= N; i++) {
      int tmp = b;
      b = a + b;
      a = tmp;
    }
    return b;
  }

  public static void main(String[] args) {
    System.out.println(new Solution_509().fib(30));
  }
}
