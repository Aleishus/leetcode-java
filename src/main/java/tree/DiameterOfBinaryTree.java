package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class DiameterOfBinaryTree {

    int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree( TreeNode root ) {
        findMax(root);
        return max;
    }

    private int findMax( TreeNode root ) {
        int left = 0, right = 0;
        if (root != null) {
            if (root.left != null) {
                left = 1 + findMax(root.left);
            }
            if (root.right != null) {
                right = 1 + findMax(root.right);
            }
        }
        max = Math.max(max, left + right);
        return Math.max(left, right);
    }

}
