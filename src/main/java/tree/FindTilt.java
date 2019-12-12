package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class FindTilt {


    int sum = 0;

    public int findTilt( TreeNode root ) {

        preOrder(root);
        return sum;
    }


    private int preOrder( TreeNode node ) {
        if (node == null) {
            return 0;
        }
        int left = preOrder(node.left);
        int right = preOrder(node.right);
        sum += Math.abs(left - right);
        return node.val +left + right;
    }

    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r3.left = r5;

        System.out.println(new FindTilt().findTilt(r1));
    }
}
