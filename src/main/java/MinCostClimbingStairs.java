/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs( int[] cost ) {
        int[] memo = new int[cost.length];
        return find(cost, -1, memo);

    }

    private int find( int[] cost, int pos, int[] memo ) {
        if (pos >= cost.length) {
            return 0;
        }
        int x = 0;
        if (pos != -1) {
            x = cost[pos];
        }
        if (pos != -1 && memo[pos] != 0) {
            return memo[pos];
        }

        int p = x + find(cost, pos + 1, memo);
        int q = x + find(cost, pos + 2, memo);

        int m = Math.min(p, q);
        if (pos != -1) {
            memo[pos] = m;
        }
        return m;
    }


    public int minCostClimbingStairsDp( int[] cost ) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int tmp = f1;
            f1 = cost[i] + Math.min(f1, f2);
            f2 = tmp;
        }
        return Math.min(f1, f2);
    }


    public static void main( String[] args ) {
        int[] costs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(costs));
        System.out.println(new MinCostClimbingStairs().minCostClimbingStairsDp(costs));
    }
}
