package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_226 {

    public TreeNode invertTree( TreeNode root ) {
        invert(root);
        return root;
    }


    private void invert( TreeNode root ) {

        if (root != null) {
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            invert(root.left);
            invert(root.right);
        }
    }

}
