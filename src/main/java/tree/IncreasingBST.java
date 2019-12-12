package tree;

import list.ListNode;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class IncreasingBST {


     TreeNode treeNode = null;
    public TreeNode increasingBST( TreeNode root ) {
        TreeNode tmp = new TreeNode(0);
        treeNode = tmp;
        middle(root);
        return tmp.right;
    }

    public void middle( TreeNode root ) {

        if (root != null) {
            middle(root.left);
            root.left = null;
            treeNode.right = root;
            treeNode = root;
            middle(root.right);
        }

    }


    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        r5.left = r3;
        r5.right = r6;
        r3.left = r2;
        r3.right = r4;
        r2.left = r1;

        TreeNode r = new IncreasingBST().increasingBST(r5);


    }
}

