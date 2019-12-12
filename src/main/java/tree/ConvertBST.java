package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class ConvertBST {

    TreeNode preNode = null;

    public TreeNode convertBST( TreeNode root ) {
        midOrder(root);
        return root;
    }


    private void midOrder( TreeNode root ) {

        if (root != null) {
            midOrder(root.right);
            if (preNode == null) {
                preNode = root;
            } else {
                root.val += preNode.val;
                preNode = root;
            }
            midOrder(root.left);
        }
    }


    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(0);
        TreeNode r3 = new TreeNode(5);
        TreeNode r4 = new TreeNode(-2);
        TreeNode r5 = new TreeNode(3);
        TreeNode r6 = new TreeNode(4);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r3.left = r5;
        r5.right = r6;

        TreeNode r = new ConvertBST().convertBST(r1);
    }
}
