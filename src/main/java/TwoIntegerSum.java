/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class TwoIntegerSum {

    public int getSum( int a, int b ) {
        //负数已经是补吗表示了，直接+ 就行了
        int res = 0;
        byte flag = 0;
        int m = 0;
        int ab = 0;
        int bb = 0;
        for (int i = 0; i < 32; i++) {
             m = 1 << i;
             ab = a & m;
             bb = b & m;
            if (( ab & bb ) == m) {
                if (flag == 1) {
                    res = res | m;
                } else {
                    flag = 1;
                }
            } else if (( ab & bb ) == 0 && ( ab | bb ) == m) {
                if (flag == 0) {
                    res = res | m;
                }
            } else {
                if (flag == 1) {
                    res = res | m;
                    flag = 0;
                }

            }

        }

        return res;


//        while(b!=0)
//        {
//            int res = (a&b)<<1;
//            a = a^b;
//            b = res;
//        }
//        return a;
    }


    public static void main( String... args ) {
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        System.out.println(twoIntegerSum.getSum(10, 20));
    }
}
