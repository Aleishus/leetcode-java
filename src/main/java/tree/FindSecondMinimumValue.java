package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class FindSecondMinimumValue {

    int secondMin = -1;


    public int findSecondMinimumValue( TreeNode root ) {
        find(root);
        return secondMin;
    }


    public void find( TreeNode root ) {
        if (root != null) {
            if (root.right != null) {
                if (root.left.val == root.val) {
                    find(root.left);
                }
                if (root.right.val == root.val) {
                    find(root.right);
                }
                if (root.left.val > root.val) {

                    if (root.left.val < secondMin && secondMin != -1) {
                        secondMin = root.left.val;
                    } else if (secondMin== -1){
                        secondMin = root.left.val;
                    }
                }
                if (root.right.val > root.val) {

                    if (root.right.val < secondMin && secondMin != -1) {
                        secondMin = root.right.val;
                    } else if(secondMin == -1) {
                        secondMin = root.right.val;
                    }
                }

            }
        }
    }

    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(5);
        TreeNode r3 = new TreeNode(2);
        TreeNode r4 = new TreeNode(2);
        TreeNode r5 = new TreeNode(3);
        r1.left = r3;
        r1.right = r2;
        r3.left = r4;
        r3.right = r5;

        System.out.println(new FindSecondMinimumValue().findSecondMinimumValue(r1));

    }
}
