package hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1078 {

    public String[] findOcurrences( String text, String first, String second ) {
        String[] words = text.split(" ");
        List<String> res = new ArrayList<>();
        int m = -2;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(first)) {
                m = i;
            } else if (words[i].equals(second)) {

                if (i - m == 1) {
                    if (i + 1 < words.length) {
                        res.add(words[i + 1]);

                    }
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main( String[] args ) {
        String tex = "alice is a good girl she is a good student a good";
       String[] res=  new Solution_1078().findOcurrences(tex, "a", "good");
    }

}
