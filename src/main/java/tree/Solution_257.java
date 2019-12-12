package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_257 {

    public List<String> binaryTreePaths( TreeNode root ) {
        List<String> paths = new ArrayList<>();
        preOrder(root, "", paths);
        return paths;
    }


    private void preOrder( TreeNode root, String path, List<String> paths ) {

        if (root != null) {
            if (root.left == null && root.right == null) {
                paths.add(path + root.val);
            } else {
                preOrder(root.left, path + root.val + "->", paths);
                preOrder(root.right, path + root.val + "->", paths);
            }
        }
    }
}
