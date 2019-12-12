package hashtable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_720 {

    //todo 44 ms 不理想，寻求其他方式  // 可以使用trie树，其实想到过，但是没有深入想后面实现下

    public String longestWord( String[] words ) {
        Arrays.sort(words, new Comparator<String>() {

            @Override
            public int compare( String o1, String o2 ) {
                if (o1.length() > o2.length()) {
                    return 1;
                }
                if (o1.length() < o2.length()) {

                    return -1;
                }
                char[] s1 = o1.toCharArray();
                char[] s2 = o2.toCharArray();
                for (int i = 0; i < s1.length; i++) {
                    if (s1[i] > s2[i]) {
                        return 1;
                    } else if (s1[i] < s2[i]) {
                        return -1;
                    }
                }
                return 0;
            }
        });

        Set<String> set = new HashSet<>(words.length);
        for (
                String word : words) {
            set.add(word);
        }

        String str = null;
        L:
        for (
                int i = words.length - 1;
                i >= 0; i--) {
            for (int p = words[i].length() - 1; p >= 1; p--) {
                String s = words[i].substring(0, p);
                if (!set.contains(s)) {
                    continue L;
                }
            }
            if (str == null) {
                str = words[i];
            } else if (str != null && words[i].length() == str.length()) {
                str = words[i];
            } else {
                break;
            }
        }
        return str;
    }


    public static void main( String[] args ) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(new Solution_720().longestWord(words));
    }
}
