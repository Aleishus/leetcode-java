package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class SumRootToLeaf {


    public int sumRootToLeaf( TreeNode root ) {
        return printEach(root, 0) ;
    }


    private int printEach( TreeNode root, int parentVal ) {
        int left = 0, right = 0;
        if (root != null) {
            int cval = ( parentVal << 1 ) | root.val;
            left = printEach(root.left, cval);
            right = printEach(root.right, cval);
            if (root.left == null && root.right == null) {
                return cval;
            }
        }
        return left + right;
    }


    public static void main( String[] args ) {
        TreeNode r = new TreeNode(1);
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(1);
        TreeNode r3 = new TreeNode(0);
        TreeNode r4 = new TreeNode(1);;

        System.out.println(new SumRootToLeaf().sumRootToLeaf(r));
    }

}
