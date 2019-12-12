package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class RangeSumBST {

    int sum = 0;
    int begin = 0;

    public int rangeSumBST( TreeNode root, int L, int R ) {

        sumBST(root, L, R);
        return sum;

    }

    private void sumBST( TreeNode root, int L, int R ) {

        if (root != null && begin!=2) {
            sumBST(root.left, L, R);
            if (root.val == L) {
                sum += root.val;
                begin = 1;
            } else if (root.val == R) {
                sum += root.val;
                begin = 2;
                return;
            } else if (begin == 1) {
                sum += root.val;
            }
            sumBST(root.right, L, R);
        }

    }

}

