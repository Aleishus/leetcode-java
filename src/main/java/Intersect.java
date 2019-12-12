import java.util.Arrays;

/**
 * Zhouxi O_o
 *
 * 两个数组的交集
 *
 * @author xi
 * @description
 */
public class Intersect {

    public int[] intersect( int[] nums1, int[] nums2 ) {
        int aLen = nums1.length;
        int bLen = nums2.length;
        int[] rev;
        int[] res;
        int m = 0;
        if (aLen <= bLen) {
            res = new int[aLen];
            rev = new int[aLen];
            for (int i = 0; i < aLen; i++) {
                ok:
                for (int j = 1; j <= bLen; j++) {
                    if (nums1[i] == nums2[j - 1]) {
                        for (int x = 0; x < aLen && rev[x] != 0; x++) {
                            if (rev[x] == j) {
                                continue ok;
                            }
                        }
                        res[m] = nums1[i];
                        rev[m] = j;
                        m++;
                        break;
                    }
                }

            }
        } else {
            res = new int[bLen];
            rev = new int[bLen];
            for (int i = 0; i < bLen; i++) {
                ok:
                for (int j = 1; j <=aLen; j++) {
                    if (nums2[i] == nums1[j-1]) {
                        for (int x = 0; x < bLen && rev[x] !=0; x++) {
                            if (rev[x] == j) {
                                continue ok;
                            }
                        }
                        res[m] = nums2[i];
                        rev[m] = j;
                        m++;
                        break;
                    }
                }
            }

        }
        int[] rm = new int[m];
        System.arraycopy(res, 0, rm, 0, m);
        return rm;
    }

    public static void main( String... args ) {
        int[] nums1 = {1, -2147483648, -2147483648}, nums2 = {-2147483648, 1, 2, 3};
        Intersect intersect = new Intersect();
        System.out.println(Arrays.toString(intersect.intersect(nums1, nums2)));
    }
}
