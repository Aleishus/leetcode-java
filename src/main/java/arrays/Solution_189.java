package arrays;

import java.util.Arrays;

public class Solution_189 {

    public void rotate( int[] nums, int k ) {
        int mod = k % nums.length;
        int[] temp = new int[mod];
        int count = 0;
        if (mod != 0) {
            for (int i = 0; i < nums.length + mod; i++) {
                int pos = i % nums.length;
                int tmp = nums[pos];
                nums[pos] = temp[count];
                temp[count] = tmp;
                count++;
                if (count == mod) {
                    count = 0;
                }
            }
        }
    }
    //todo 方法4 是没有想到的 https://leetcode-cn.com/problems/rotate-array/solution/xuan-zhuan-shu-zu-by-leetcode/

    public static void main( String[] args ) {
        int[] nums = {1, 2, 3, 4};
        new Solution_189().rotate(nums, 5);
        System.out.println(Arrays.toString(nums));

    }
}
