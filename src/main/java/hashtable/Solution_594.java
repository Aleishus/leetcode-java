package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_594 {

    public int findLHS( int[] nums ) {

        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] - nums[j] == 1) {
                        sum++;
                        flag = true;

                    }
                    if (nums[i] - nums[j] == 0) {
                        sum++;
                    }
                }
                if (flag && sum > max) {
                    max = sum;
                }
            }
        }
        return max + 1;

    }

    //todo 对hash 表理解还不够透彻，注意
    public int findLHS1( int[] nums ) {

        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.containsKey(num + 1)) {
                res = Math.max(res, map.get(num) + map.get(num + 1));
            }
            if (map.containsKey(num - 1)) {
                res = Math.max(res, map.get(num) + map.get(num - 1));
            }
        }
        return res;


    }

    public static void main( String[] args ) {
        int[] A = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(new Solution_594().findLHS1(A));
    }
}
