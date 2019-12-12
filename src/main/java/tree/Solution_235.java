package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_235 {

    public TreeNode lowestCommonAncestor( TreeNode root, TreeNode p, TreeNode q ) {

        TreeNode cur1 = null, cur2 = null;

        while (root != null) {
            cur1 = root;
            cur2 = root;
            if (p.val == root.val) {
                cur1 = root;
                break;
            } else if (p.val < root.val) {
                cur1 = cur1.left;
            } else {
                cur1 = cur1.right;
            }
            if (q.val == root.val) {
                cur1 = root;
                break;
            } else if (q.val < root.val) {
                cur2 = cur2.left;
            } else {
                cur2 = cur2.right;
            }
            if (cur1.val == cur2.val) {
                root = cur1;
            } else {
                cur1 = root;
                break;
            }

        }
        return cur1;

    }

}
