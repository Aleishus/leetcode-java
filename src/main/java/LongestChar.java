/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class LongestChar {

    public int lengthOfLongestSubstring( String s ) {

        int max = 0;
        StringBuilder tmp = new StringBuilder(s.length());
        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            index = tmp.toString().indexOf(s.charAt(i));
            if (index == -1) {
                tmp.append(s.charAt(i));
                if (tmp.length() > max) {
                    max = tmp.length();
                }
            } else {
                    tmp.delete(0, index+1);
                    tmp.append(s.charAt(i));
            }

        }
        return max;

    }

    public static void main( String... args ) {
        LongestChar longestChar = new LongestChar();
        System.out.println(longestChar.lengthOfLongestSubstring("  "));
    }

}
