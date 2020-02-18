package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1313 {
    public int[] decompressRLElist(int[] nums) {

        List<Integer> sb = new ArrayList<>();
        for(int i = 0 ;i<nums.length/2;i++){
            int a = nums[2*i];
            int b = nums[2*i+1];
            int j = 0;
            while (j<a){
                sb.add(b);
                j++;
            }
        }

        return sb.stream().mapToInt(Integer::intValue).toArray();

    }
}
