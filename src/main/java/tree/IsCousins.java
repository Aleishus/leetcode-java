package tree;

import list.ListNode;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class IsCousins {

    private int dep = 0;
    private TreeNode depParent = null;
    private int match = 1;

    public boolean isCousins( TreeNode root, int x, int y ) {

        return findCousins(root, x, y, 0, null);
    }

    private boolean findCousins( TreeNode root, int x, int y, int depth, TreeNode parent ) {
        boolean flag = false;
        if (root != null) {
            if (root.val == x || root.val == y) {
                if (dep == depth && depParent != null && parent != null
                        && depParent.val != parent.val && match == 0) {
                    return true;
                } else {
                    dep = depth;
                    depParent = parent;
                    match--;
                }
            }
            if (!findCousins(root.left, x, y , depth + 1, root)) {
                flag = findCousins(root.right, x, y, depth + 1, root);
            } else {
                flag = true;
            }

        }
        return flag;
    }


    public static void main( String[] args ) {
        TreeNode r = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(5);
        ;

        r.left = r1;
        r.right = r2;


        System.out.println(new IsCousins().isCousins(r, 2, 3));

    }


}
