/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MaxProfit {

    public int maxProfit( int[] prices ) {
        int max = 0;
        if (prices.length == 0) {
            return max;
        }
        int pos = prices[0];
        int ans = -1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > pos) {
                pos = prices[i];
                for (int j = 0; j < i; j++) {
                    ans = prices[i] - prices[j];
                    if (ans > max) {
                        max = ans;
                    }
                }
            }
        }
        return max;
    }

    public static void main( String[] args ) {
        MaxProfit profit = new MaxProfit();
        int[] prices = {2,7,2,4,5,6,7};
        int max = -1;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if(prices[i]-min>max){
                max =prices[i]-min ;
            }

        }

        System.out.println(max);
    }
}
