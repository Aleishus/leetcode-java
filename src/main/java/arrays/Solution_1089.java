package arrays;

import java.util.Arrays;

public class Solution_1089 {

    public void duplicateZeros( int[] arr ) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j--;
            }
            if (i == j || j - i == 1) {
                break;
            }

        }
        int i = arr.length - 1;

        while (i != j & j >= 0) {
            arr[i] = arr[j];
            if (arr[j] == 0 && i != arr.length - 1) {
                arr[--i] = 0;
            }
            i--;
            j--;
        }
    }

    public static void main( String[] args ) {
        int[] nums = {1, 1, 1, 0, 0, 1, 0,0};
        new Solution_1089().duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
