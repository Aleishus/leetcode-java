package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MinDiffInBST {

    // BST 注意有序的，中序遍历是有序的

    int min = Integer.MAX_VALUE;
    TreeNode pre;

    public int minDiffInBST( TreeNode root ) {
        min(root);
        return min;
    }

    private void min( TreeNode root ) {

        if (root != null) {
            min(root.left);
            if (pre != null) {
                min = Math.min(min, root.val - pre.val);
            }
            pre = root;
            min(root.right);
        }
    }

}
