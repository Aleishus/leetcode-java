package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class PathSum {

    int count = 0;

    public int pathSum( TreeNode root, int sum ) {
        find(root, sum);
        return count;
    }

    private void find( TreeNode root, int sum ) {
        if (root != null) {
            check(root, sum);
            find(root.left, sum);
            find(root.right, sum);
        }
    }



    private void check( TreeNode root, int cur ) {
        if (root != null) {
            if (root.val == cur) {
                count++;
            }
            check(root.left, cur - root.val);
            check(root.right, cur - root.val);
        }
    }

    // todo 重要的性质 累加和 减去 任意一个数字，如果差包含在累加和的数字中，那么被减去的那个数字也是一个累加和

}
