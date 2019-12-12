package dynamicprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_322 {


    public int coinChange( int[] coins, int amount ) {

        if (amount == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;

        for (int c : coins) {
            if (( amount - c ) < 0) {
                continue;
            }
            int subAns = coinChange(coins, amount - c);
            if (subAns == -1) {
                continue;
            }
            ans = Math.min(ans, subAns + 1);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;

    }

    public int coinChange1( int[] coins, int amount, Map<Integer, Integer> memo ) {

        if (amount == 0) {
            return 0;
        }
        if (memo.get(amount) != null) {
            return memo.get(amount);
        }
        int ans = Integer.MAX_VALUE;

        for (int c : coins) {
            if (( amount - c ) < 0) {
                continue;
            }
            int subAns = coinChange(coins, amount - c);
            if (subAns == -1) {
                continue;
            }
            ans = Math.min(ans, subAns + 1);
        }
        memo.put(amount, ans);
        return ans == Integer.MAX_VALUE ? -1 : ans;

    }

    public int coinChange2( int[] coins, int amount ) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (c <= i) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }


    public static void main( String[] args ) {
        Solution_322 coinChange = new Solution_322();
        int[] coins = {1, 2, 5};
        List<List<Integer>> res = new ArrayList<>();
        long m = System.nanoTime();
        int x = coinChange.coinChange(coins, 11);
        System.out.println(x);
        System.out.println(System.nanoTime() - m);
        m = System.nanoTime();
        x = coinChange.coinChange1(coins, 11, new HashMap<>(coins.length));
        System.out.println(x);
        System.out.println(System.nanoTime() - m);
        m = System.nanoTime();
        x = coinChange.coinChange2(coins, 11);
        System.out.println(x);
        System.out.println(System.nanoTime() - m);
    }

}
