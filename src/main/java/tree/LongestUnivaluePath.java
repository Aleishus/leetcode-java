package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class LongestUnivaluePath {

    int max = Integer.MIN_VALUE;

    public int longestUnivaluePath( TreeNode root ) {
        findMax(root);
        return max;
    }

    private int findMax( TreeNode root ) {
        int left = 0, right = 0;
        if (root != null) {
            if (root.left != null && root.left.val == root.val) {
                left = 1 + findMax(root.left);
            } else {
                findMax(root.left);
            }
            if (root.right != null && root.right.val == root.val) {
                right = 1 + findMax(root.right);
            } else {
                findMax(root.right);
            }
        }
        max = Math.max(max, left + right);
        return Math.max(left, right);
    }


    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(5);
        TreeNode r2 = new TreeNode(4);
        TreeNode r3 = new TreeNode(5);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(4);
        TreeNode r6 = new TreeNode(5);
        TreeNode r7 = new TreeNode(4);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r5.left = r7;
        r3.right = r6;

        System.out.println(new LongestUnivaluePath().longestUnivaluePath(r1));

    }


}
