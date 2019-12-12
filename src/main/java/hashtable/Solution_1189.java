package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1189 {

    public int maxNumberOfBalloons( String text ) {
        int[] hash = new int[26];
        //0->a 1->b,2->l,3->o,4->n
//todo if else 其实也很耗时间  如下面被注释的方式，每次都要去判断下标，倒是耗时增加

        for(char c: text.toCharArray()) {
            hash[c-'a']++;
        }

//        for (int i = 0, j = text.length() - 1; i <= j; i++, j--) {
//            hash[text.charAt(i) - 'a'] += 1;
//            if (i != j) {
//                hash[text.charAt(j) - 'a'] += 1;
//            }
//        }
        hash['l' - 'a'] /= 2;
        hash['o' - 'a'] /= 2;
        int min = Integer.MAX_VALUE;
        min = Math.min(min, hash['b' - 'a']);
        min = Math.min(min, hash['a' - 'a']);
        min = Math.min(min, hash['l' - 'a']);
        min = Math.min(min, hash['o' - 'a']);
        min = Math.min(min, hash['n' - 'a']);

        return min;

    }

    public static void main( String[] args ) {
        String s = "loonbalxballpoon";
        System.out.println(new Solution_1189().maxNumberOfBalloons(s));
    }
}
