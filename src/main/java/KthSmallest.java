import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class KthSmallest {


    static class IJ {

        int i;
        int j;
    }

    private Stack<IJ> stack = new Stack();
    private List<Integer> list = new ArrayList<Integer>();

    public int kthSmallest( int[][] matrix, int k ) {
        int n = matrix[0].length;
        if (k == 1) {
            return matrix[0][0];
        }
        IJ r = new IJ();
        r.i = 0;
        r.j = 0;
        stack.push(r);
        int res = 0;
        IJ t = null;
        while (( t = stack.pop() ) != null) {
            find(matrix, t, n, k);
            if (list.size() == k) {
                res = list.get(list.size() - 1);
                break;
            }
        }

        return res;
    }

    private void find( int[][] matrix, IJ ij, int n, int k ) {
        if (ij.i+1 == n || ij.j+1 == n) {
            return;
        }
        int a = matrix[ij.i + 1][ij.j];
        int b = matrix[ij.i][ij.j + 1];
        if (a <= b) {
            list.add(a);
            if (list.size() == k) {
                return;
            }
            //b
            IJ x = new IJ();
            x.i = ij.i;
            x.j = ij.j + 1;
            stack.push(x);
            //a
            IJ y = new IJ();
            y.i = ij.i + 1;
            y.j = ij.j;
            stack.push(y);

        } else {
            list.add(b);
            if (list.size() == k) {
                return;
            }
            //a
            IJ y = new IJ();
            y.i = ij.i + 1;
            y.j = ij.j;
            stack.push(y);
            //b
            IJ x = new IJ();
            x.i = ij.i;
            x.j = ij.j + 1;
            stack.push(x);
        }

    }

    public static void main( String... args ) {
        KthSmallest kthSmallest = new KthSmallest();
        int[][] martrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println(kthSmallest.kthSmallest(martrix,8));
    }


}
