package hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_204 {

    //todo 求素数经典算法，利用两个性质
    // 1.求一个数是不是素数，只需要判断 2 到 sqrt（n）中的数是否能被n整除即可
    // 2. 如果一个是合数都能表示成比它小的素数的乘积
    // 综合上述两点，我们只需要判断，比前sqrt（n）包含的素数能不能被 n 整除即可

    public int countPrimes( int n ) {
        if (n < 3) {
            return 0;
        }
        int[] primes = new int[n];
        primes[0] = 2;
        int count = 0;
        int cur = 3;
        L:
        while (cur < n) {
            int index = 0;
            int max = (int) Math.sqrt(cur);
            while (primes[index] <= max) {
                if (cur % primes[index] == 0) {
                    cur++;
                    continue L;
                }
                index++;
            }
            count++;
            primes[count] = cur;
            cur++;

        }
        return count + 1;

    }

    //  此算法更加高效，反过来筛选
   /* int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i < n; i++)
            if (isPrim[i])
                for (int j = i * i; j < n; j += i)
                    isPrim[j] = false;

        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrim[i]) count++;

        return count;
    }*/



    public static void main( String[] args ) {

        System.out.println(new Solution_204().countPrimes(3));
    }

}
