package hashtable;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_389 {

    public char findTheDifference( String s, String t ) {
        byte[] letters = new byte[26];

        for (char ch : s.toCharArray()) {
            letters[ch - 'a'] += 1;
        }

        for (char ch : t.toCharArray()) {
            if (( letters[ch - 'a'] -= 1 ) < 0) {

                return ch;
            }
        }

        return 0;
    }

    //todo 做差异比较可以使用异或 的方式
   /* class Solution {
        public char findTheDifference(String s, String t) {
            char a =0;
            for(int i = 0 ; i < s.length() ; i++){
                a^=s.charAt(i);
            }
            for(int i = 0 ; i < t.length() ; i++){
                a^=t.charAt(i);
            }
            return a;

        }
    }*/



}
