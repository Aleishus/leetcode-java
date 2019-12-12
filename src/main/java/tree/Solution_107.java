package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_107 {

    public List<List<Integer>> levelOrderBottom( TreeNode root ) {

        List<List<Integer>> res = new ArrayList<>();
        postOrder(root, 0, res);
        int i = 0, j = res.size() - 1;
        while (i <= j) {
            List<Integer> t = res.get(i);
            res.set(i, res.get(j));
            res.set(j, t);
            i++;
            j--;
         }
        return res;
    }


    private void postOrder( TreeNode root, int depth, List<List<Integer>> res ) {

        if (root != null) {
            if (depth > res.size() - 1) {
                List<Integer> cur = new ArrayList<>();
                cur.add(root.val);
                res.add(depth, cur);
            } else {
                List<Integer> cur = res.get(depth);
                cur.add(root.val);
            }
            postOrder(root.left, depth + 1, res);
            postOrder(root.right, depth + 1, res);

        }
    }

    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(3);
        TreeNode r2 = new TreeNode(9);
        TreeNode r3 = new TreeNode(20);
        TreeNode r4 = new TreeNode(15);
        TreeNode r5 = new TreeNode(7);
        r1.left = r2;
//        r1.right = r3;
//        r3.left = r4;
//        r3.right = r5;

        List<List<Integer>> r = new Solution_107().levelOrderBottom(r1);

    }
}
