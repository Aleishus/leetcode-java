package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_110 {

    boolean flag = true;

    public boolean isBalanced( TreeNode root ) {
        depth(root);
        return flag;
    }


    public int depth( TreeNode root ) {

        if (!flag) {
            return 0;
        }
        if (root == null) {
            return 0;
        }

        int left = depth(root.left) + 1;
        int right = depth(root.right) + 1;
        if (Math.abs(left - right) > 1) {
            flag = false;
            return 0;
        }
        return Math.max(left, right);
    }


    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        r1.right = r2;
        r1.left = r3;

        System.out.println(new Solution_110().isBalanced(r1));


    }


}
