package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class IsUnivalTree {

    public boolean isUnivalTree( TreeNode root ) {

        return check(root, root.val);
    }

    private boolean check( TreeNode root, int val ) {

        boolean flag = true;
        if (root != null) {
            if (root.val != val) {
                return false;
            }
            if (check(root.left, val)) {
                flag = check(root.right, val);
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static void main( String[] args ) {
        TreeNode r = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(1);
        r.left = r1;
        r.right = r2;

        System.out.println(new IsUnivalTree().isUnivalTree(r));
    }

}
