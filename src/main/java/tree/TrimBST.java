package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class TrimBST {

    //todo 通过递归刷选，构造一颗新的树，思想值得借鉴

    public TreeNode trimBST( TreeNode root, int L, int R ) {
        if (root == null) {
            return root;
        }
        if (root.val > R) {
            TreeNode tmp = root.left;
            root.left = null;
            return trimBST(tmp, L, R);
        }
        if (root.val < L) {
            TreeNode tmp = root.right;
            root.right = null;
            return trimBST(tmp, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;

    }

    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(3);
        TreeNode r2 = new TreeNode(0);
        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(2);
        TreeNode r5 = new TreeNode(1);
        //TreeNode r6 = new TreeNode(6);

        r1.left = r2;
        r1.right = r3;
        r2.right = r4;
        r4.left = r5;

        TreeNode r = new TrimBST().trimBST(r1, 1, 3);


    }
}
