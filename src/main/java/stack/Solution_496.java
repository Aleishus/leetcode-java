package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_496 {

    public int[] nextGreaterElement( int[] nums1, int[] nums2 ) {

        int[] result = new int[nums1.length];
        Map<Integer, Integer> keyMap = new HashMap<>(nums2.length);
        for (int i = 0; i < nums2.length; i++) {
            keyMap.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            int v = keyMap.get(nums1[i]);
            result[i] = -1;
            for (; v < nums2.length; v++) {
                if (nums2[v] > nums1[i]) {
                    result[i] = nums2[v];
                    break;
                }
            }
        }
        return result;

    }

    //todo 还可以用单调栈的方式  stack+ map 直接看 题解 https://leetcode-cn.com/problems/next-greater-element-i/solution/xia-yi-ge-geng-da-yuan-su-i-by-leetcode/

    public static void main( String[] args ) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(new Solution_496().nextGreaterElement(nums1, nums2)));
    }
}
