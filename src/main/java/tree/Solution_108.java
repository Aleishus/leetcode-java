package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_108 {

    public TreeNode sortedArrayToBST( int[] nums ) {
        TreeNode root = null;
        if (nums.length > 0) {
            root = new TreeNode(-1);
            print(nums, 0, nums.length - 1, root);
        }
        return root;
    }

    private void print( int[] num, int low, int high, TreeNode root ) {

        if (low == high) {
            root.val = num[low];
            return;
        } else {
            int mid = ( low + high ) / 2;
            root.val = num[mid];
            if (low <= mid - 1) {
                root.left = new TreeNode(-1);
                print(num, low, mid - 1, root.left);
            }
            if (mid + 1 <= high) {
                root.right = new TreeNode(-1);
                print(num, mid + 1, high, root.right);
            }
        }
    }

    public static void main( String[] args ) {
        int[] nums = {};

        TreeNode r = new Solution_108().sortedArrayToBST(nums);
    }
}
