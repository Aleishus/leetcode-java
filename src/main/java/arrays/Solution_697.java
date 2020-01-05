package arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_697 {

    public int findShortestSubArray( int[] nums ) {
        //todo 使用单个数组比使用多维数组要快

        int[] map = new int[50000];
        int[] m = new int[50000];
        int[] n = new int[50000];
        int max = 0;
        int min = 50000;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            map[x]++;
            if (m[x] == 0) {
                m[x] = i + 1;
                ;
            } else {
                n[x] = i + 1 - m[x];
            }
            if (map[x] > max) {
                max = map[x];
                min = n[x];
            } else if (map[x] == max) {
                int dis = n[x];
                if (dis < min) {
                    min = dis;
                }
            }
        }
        return min + 1;
    }

    public static void main( String[] args ) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(new Solution_697().findShortestSubArray(nums));
    }
}
