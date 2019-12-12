package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_101 {

    public boolean isSymmetric( TreeNode root ) {
        return same(root, root);
    }

    private boolean same( TreeNode p, TreeNode q ) {
        boolean flag = false;
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                flag = same(p.left, q.right) && same(p.right, q.left);
            }
        }
        return flag;
    }

}
