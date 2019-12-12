package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class IsSubtree {

    public boolean isSubtree( TreeNode s, TreeNode t ) {
        boolean flag = false;
        if (s == null) {
            return false;
        }
        if (s.val == t.val) {
            flag = check(s, t);
        }
        if (flag) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }


    private boolean check( TreeNode s, TreeNode t ) {

        if (s == null && t == null) {
            return true;
        }
        if (t == null && s != null) {
            return false;
        }
        if (t != null && s == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return check(s.left, t.left) && check(s.right, t.right);
    }


    public static void main( String[] args ) {

        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(1);
        TreeNode r5 = new TreeNode(2);

        TreeNode r6 = new TreeNode(3);
        TreeNode r7 = new TreeNode(1);
        TreeNode r8 = new TreeNode(3);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;

        r6.left = r7;
        r6.right = r8;

        System.out.println(new IsSubtree().isSubtree(r1, r6));
    }

}
