package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_448 {

    //todo 原地算法标记为负数 做标记的方法
    public List<Integer> findDisappearedNumbers( int[] nums ) {

        List<Integer> list = new ArrayList<>();
        int[] map = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            map[nums[i]-1] = -1;
        }

        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0) {
                list.add(i + 1);
            }

        }
        return list;
    }

    public static void main( String[] args ) {
        int[] nums = {4,3,5,7,8,2,3,1};
        List<Integer> list = new Solution_448().findDisappearedNumbers(nums);
        System.out.println(list);
    }
}
