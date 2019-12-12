package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_953 {

    public boolean isAlienSorted( String[] words, String order ) {
        int[] letterOrder = new int[26];
        // 存储顺序
        int i = 1;
        for (int ch : order.toCharArray()) {
            letterOrder[ch - 'a'] = i;
            i++;
        }
        char[][] tmp = new char[words.length][];

        for (i = 0; i < tmp.length - 1; i++) {
            if (tmp[i] == null) {
                tmp[i] = words[i].toCharArray();
            }
            if (tmp[i + 1] == null) {
                tmp[i + 1] = words[i+1].toCharArray();
            }
            for (int j = 0; j < tmp[i].length; j++) {

                int x = letterOrder[tmp[i][j]-'a'];
                int y;
                if (j > tmp[i + 1].length-1) {
                    y = 0;
                } else {
                    y = letterOrder[tmp[i + 1][j]-'a'];
                }
                if (x < y) {
                    break;
                } else if (x > y) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main( String[] args ) {
        String[] words = {"kuvp","q"};
        String orders = "ngxlkthsjuoqcpavbfdermiywz";
        System.out.println(new Solution_953().isAlienSorted(words, orders));

    }


}
