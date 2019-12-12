package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_884 {

    public String[] uncommonFromSentences( String A, String B ) {
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        List<String> res = new ArrayList<>();
        Map<String, Integer> back = new HashMap<>();
        for (String m : a) {
            back.put(m, back.getOrDefault(m, 0) + 1);
        }
        for (String n : b) {
            back.put(n, back.getOrDefault(n, 0) + 1);
        }

        Iterator<Entry<String, Integer>> i = back.entrySet().iterator();
        while (i.hasNext()) {
            Entry<String, Integer> e = i.next();
            if (e.getValue() > 1) {
                i.remove();
            }
        }
        return back.keySet().toArray(new String[back.keySet().size()]);
    }

    public static void main( String[] args ) {
        String A = "s z z z s";
        String B = "s z ejt";
        String[] res = new Solution_884().uncommonFromSentences(A, B);
    }
}
