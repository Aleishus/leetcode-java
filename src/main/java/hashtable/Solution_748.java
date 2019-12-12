package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_748 {

    public String shortestCompletingWord( String licensePlate, String[] words ) {
        int[] maps = new int[26];
        int[] temp = new int[26];
        int count = 0;
        String res = null;
        int len = 20;
        for (int ch : licensePlate.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = ch + 32;
            }
            int i = ch - 'a';
            if (i >= 0) {
                maps[i]++;
                count++;
            }
        }
        int i = 0;

        for (String word : words) {
            if (word.length() >= len) {
                continue;
            }
            i = 0;
            System.arraycopy(maps, 0, temp, 0, 26);
            for (int ch : word.toCharArray()) {
                if (( temp[ch - 'a'] -= 1 ) >= 0) {
                    i++;
                }
            }
            if (i == count) {
                if (word.length() < len) {
                    len = word.length();
                    res = word;
                }
            }

        }
        return res;
    }

    public static void main( String[] args ) {
        ;
        String[] words = {"looks", "pest", "stew", "show"};
        System.out.println(new Solution_748().shortestCompletingWord("1S3 456", words));
    }
}
