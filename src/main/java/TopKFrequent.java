import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class TopKFrequent {

    static class Ref {

        int count;
        int num;
    }

    public List<Integer> topKFrequent( int[] nums, int k ) {

        Map<Integer, Ref> m1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Ref ref = m1.get(( nums[i] ));
            if (ref != null) {
                ref.count += 1;
                m1.put(nums[i], ref);

            } else {
                ref = new Ref();
                ref.num = nums[i];
                ref.count = 1;
                m1.put(nums[i], ref);
            }
        }

        Ref[] t = m1.values().toArray(new Ref[1]);
        Arrays.sort(t, new Comparator<Ref>() {
            @Override
            public int compare( Ref o1, Ref o2 ) {
                if (o1.count > o2.count) {
                    return -1;
                }
                if (o1.count < o2.count) {
                    return 1;
                }
                return 0;
            }
        });

        List<Integer> res = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            res.add(t[i].num);
        }
        return res;
    }

    public static void main( String... args ) {
        TopKFrequent topKFrequent = new TopKFrequent();
        int nums[] = {4, 1, -1, 2, -1, 2, 3};
        System.out.println(topKFrequent.topKFrequent(nums, 2));
    }

}
