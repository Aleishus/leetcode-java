package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_387 {

    public int firstUniqChar( String s ) {
        char[] chs = s.toCharArray();
        int[] count = new int[26];
        int mid = chs.length / 2;
        if (mid == 0 && chs.length > 0) {
            return 0;
        }
        boolean odd = chs.length % 2 == 1 ? true : false;
        int p1 = 0, p2 = chs.length - 1;
        if (odd) {
            while (p2 > mid) {
                count[chs[p2] - 'a']++;
                count[chs[p1] - 'a']++;
                p2--;
                p1++;
            }
            count[chs[mid] - 'a']++;

        } else {
            while (p2 >= mid) {
                count[chs[p2] - 'a']++;
                count[chs[p1] - 'a']++;
                p2--;
                p1++;
            }
        }

        for (int i = 0; i < chs.length; i++) {
            if (count[chs[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main( String... args ) {
        Solution_387 firstUniqChar = new Solution_387();
        System.out.println(firstUniqChar.firstUniqChar(""));
    }
}
