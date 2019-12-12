package tree;

/**
 * Zhouxi O_o
 *
 * @author xi

 */
public class Solution_112 {

    boolean flag = false;

    public boolean hasPathSum( TreeNode root, int sum ) {
        return sum(root, 0, sum);
    }


    private boolean sum( TreeNode root, int added, int sum ) {

        if (flag) {
            return false;
        }
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (added + root.val == sum) {
                flag = true;
                return true;
            }
            return false;
        }
        return sum(root.left, root.val + added, sum) || sum(root.right, root.val + added, sum);

    }
}
