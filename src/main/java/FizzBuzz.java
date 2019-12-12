import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class FizzBuzz {

    public List<String> fizzBuzz( int n ) {
        String x = "Fizz";
        String y = "Buzz";
        String z = "FizzBuzz";
        List<String> l = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                l.add(z);
            } else if (i % 5 == 0) {
                l.add(y);
            } else if (i % 3 == 0) {
                l.add(x);
            } else {
                l.add("" + i);
            }
        }
        return l;
    }

}
