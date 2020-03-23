package arrays;

public class Solution_905 {

  public int[] sortArrayByParity(int[] A) {

    int j = A.length - 1;
    int i = 0;
    while (i <= j) {
      if (A[i] % 2 == 1) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
        j--;
      } else {
        i++;
      }

    }
    return A;
  }
}
