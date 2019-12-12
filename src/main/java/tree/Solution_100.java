package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_100 {

    public boolean isSameTree( TreeNode p, TreeNode q ) {

        boolean flag = false;
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                flag = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
        return flag;
    }
}
