package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_811 {

    public List<String> subdomainVisits( String[] cpdomains ) {
        Map<String, Integer> rankMap = new HashMap<>();
        for (String str : cpdomains) {
            StringBuilder sb = new StringBuilder();
            String[] mp = str.split(" ");
            int count = Integer.parseInt(mp[0]);
            String[] domains = mp[1].split("\\.");
            for (int i = domains.length - 1; i >= 0; i--) {
                if (i != domains.length - 1) {
                    sb.insert(0, ".");
                }
                sb.insert(0, domains[i]);
                rankMap.put(sb.toString(), rankMap.getOrDefault(sb.toString(), 0) + count);

            }
        }

        List<String> res = new ArrayList<>();

        for (Entry<String, Integer> entry : rankMap.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getValue()).append(" ").append(entry.getKey());
            res.add(sb.toString());
        }
        return res;
    }

    public static void main( String[] args ) {
        String[] d = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        System.out.println(new Solution_811().subdomainVisits(d));
    }

}
