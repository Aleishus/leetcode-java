package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1200 {

    public List<List<Integer>> minimumAbsDifference( int[] arr ) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            if (tmp < min) {
                min = tmp;
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            if (tmp == min) {
                min = tmp;
                List<Integer> tL = new ArrayList<>();
                tL.add(arr[i - 1]);
                tL.add(arr[i]);
                res.add(tL);
            }
        }

        return res;

    }


    public static void main( String[] args ) {

    }
}
