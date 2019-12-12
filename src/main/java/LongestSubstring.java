import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class LongestSubstring {

    /**
     * 计算长度
     */
    private int count( char[] s, int start, int end, int[] sum, int k ) {

        if (( end - start + 1 ) < k) {
            return 0;
        }
        for (int i = 0; i < 26; i++) {
            sum[i] = 0;
        }
        for (int i = start; i <= end; i++) {
            sum[s[i] - 'a']++;
        }
        //从前向后搜索
        while (( end - start + 1 ) >= k && sum[s[start] - 'a'] < k) {
            start++;
        }
        //从后向前搜索
        while (( end - start + 1 ) >= k && sum[s[end] - 'a'] < k) {
            end--;
        }
        if (( end - start + 1 ) < k) {
            return 0;
        }

        for (int i = start; i <= end; i++) {
            if (sum[s[i] - 'a'] < k) {
                return Math.max(count(s, start, i - 1, sum, k), count(s, i + 1, end, sum, k));
            }
        }
        return end - start + 1;

    }

    public int longestSubstring( String s, int k ) {

        int len = s.length();
        char[] chars = s.toCharArray();
        //记录26个小写字母出现的次数
        int[] sum = new int[26];
        if (k < 2) {
            return len;
        }
        if (len < k) {
            return 0;
        }
        return count(chars, 0, len - 1, sum, k);

    }

    public static void main( String... args ) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.longestSubstring("aacbbbdc", 2));
    }
}
