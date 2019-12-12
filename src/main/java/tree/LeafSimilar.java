package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class LeafSimilar {

    int pos = 0;

    public boolean leafSimilar( TreeNode root1, TreeNode root2 ) {
        List<Integer> sb = new ArrayList<>(10);
        find(root1, sb, 0);
        return find(root2, sb, 1);

    }

    private boolean find( TreeNode root, List<Integer> sb, int match ) {

        boolean flag = true;

        if (root != null) {
            if (root.left == null && root.right == null) {
                if (match == 1) {
                    if (sb.get(pos) != root.val) {
                        return false;
                    } else {
                        pos++;
                    }
                } else {
                    sb.add(root.val);
                }
            } else {
                if (find(root.left, sb, match)) {
                    flag = find(root.right, sb, match);
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }


    public static void main( String[] args ) {

        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(2);
        TreeNode r6 = new TreeNode(3);
        r1.left = r2;
        r1.right = r3;

        r4.left = r5;
        r4.right = r6;

        System.out.println(new LeafSimilar().leafSimilar(r1,r4));

    }
}
