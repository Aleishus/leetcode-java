package test;

import java.util.Map;
import tree.TreeNode;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class PathTest {


    public static void pathSum( TreeNode root, Map<Integer, Integer> sums ) {
        if (root != null) {

        int t = sums.getOrDefault(root.val, 0);
        sums.put(root.val, t + 1);




        }


    }

}
