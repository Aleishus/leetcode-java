package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_202 {

    //todo 快慢指针解决循环问题，对于很大的数据，如果使用集合去重可能导致内存益处，

    int[] sums = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81};

    public boolean isHappy( int n ) {
        int slow = n;
        int fast = n;
        while (true) {

            slow = calc(slow);
            fast = calc(calc(fast));
            if (slow == 1) {
                return true;
            }
            if (fast == slow) {
                return false;
            }
        }
    }

    int calc( int n ) {
        int sum = 0;
        while (n > 0) {
            int x = n % 10;
            sum += sums[x];
            n = n / 10;
        }
        return sum;
    }

    public static void main( String[] args ) {
        System.out.println(new Solution_202().isHappy(119));
    }
}
