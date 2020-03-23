package arrays;

import java.util.Arrays;

public class Solution_1385 {

  private int res = 0;

  public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    Arrays.sort(arr2);

    for(int i : arr1){
      check(i,0,arr2.length,arr2,d);
    }

    return arr1.length-res;
  }


  private boolean check(int r, int begin, int end, int[] arr, int d) {
    if(begin<end){
      int mid = (begin + end) / 2;
      if(Math.abs(r-arr[mid])<=d){
        System.out.println(r);
        return true;
      }
      else if(r - arr[mid]>d){
        return check(r,mid+1,end,arr,d);
      }
    }

    return false;

  }

  public static void main(String[] args) {
    int [] arr1 = {1,4,2,3}, arr2 = {-4,-3,6,10,20,30};
    System.out.println( new Solution_1385().findTheDistanceValue(arr1,arr2,3));
  }
}
