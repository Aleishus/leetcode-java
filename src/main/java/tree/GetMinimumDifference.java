package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class GetMinimumDifference {

    TreeNode pre;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference( TreeNode root ) {

        midOrder(root);
        return min;
    }

    private void midOrder( TreeNode root ) {
        if (root != null) {
            midOrder(root.left);
            if (pre == null) {
                pre = root;
            } else {
                min = Math.min(min, root.val - pre.val);
                pre = root;
            }
            midOrder(root.right);
        }
    }
}
