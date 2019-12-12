package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_111 {

    public int minDepth( TreeNode root ) {
        if (root == null) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return Math.max(1 + minDepth(root.left), 1 + minDepth(root.right));
        }
        return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));
    }

    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(2);
        TreeNode r4 = new TreeNode(2);

        r1.right = r2;
        r1.left = r3;
        r3.left = r4;

        System.out.println(new Solution_111().minDepth(r1));
    }
}
