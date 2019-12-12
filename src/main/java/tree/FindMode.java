package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class FindMode {


    int max = 0;
    int cur = 0;
    int count = 0;

    public int[] findMode( TreeNode root ) {

        List<Integer> back = new ArrayList<>();
        midOrder(root, back);
        if (count > max) {
            back.clear();
            back.add(cur);
        } else if (count == max) {
            back.add(cur);
        }
        int[] res = new int[back.size()];
        for (int i = 0; i < back.size(); i++) {
            res[i] = back.get(i);
        }
        return res;
    }


    private void midOrder( TreeNode root, List<Integer> back ) {

        if (root != null) {
            midOrder(root.left, back);

            if (cur == root.val) {
                count++;
            }
            if (max == 0) {
                back.add(root.val);
                cur = root.val;
                count = 1;
                max = Integer.MAX_VALUE;
            }
            if (cur != root.val) {

                if (max == Integer.MAX_VALUE) {
                    max = count;
                } else if (count > max) {
                    back.clear();
                    back.add(cur);
                    max = count;
                } else if (count == max) {
                    back.add(cur);
                }
                count = 1;
                cur = root.val;
            }

            midOrder(root.right, back);

        }


    }

    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(4);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(5);
        TreeNode r4 = new TreeNode(2);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(5);
        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
//        r2.right = r5;
        r3.right = r6;

        int[] r = new FindMode().findMode(r1);


    }


}
