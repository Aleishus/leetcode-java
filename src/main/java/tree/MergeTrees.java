package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MergeTrees {

    public TreeNode mergeTrees( TreeNode t1, TreeNode t2 ) {

        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        preOrder(t1, t2);
        return t1;
    }

    private void preOrder( TreeNode t1, TreeNode t2 ) {
        if (t1 != null && t2 != null) {
            t1.val += t2.val;
            if (t1.left != null && t2.left != null) {
                preOrder(t1.left, t2.left);
            }
            if (t1.right != null && t2.right != null) {
                preOrder(t1.right, t2.right);
            }
            if (t1.left == null) {
                t1.left = t2.left;
            }
            if (t1.right == null) {
                t1.right = t2.right;
            }
        }
    }
}
