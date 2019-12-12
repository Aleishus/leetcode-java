package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class MaxDepth {

    public int maxDepth( Node root ) {
        int len = 1;
        if (root == null) {
            return 0;
        }
        if (root.children != null) {
            for (Node node : root.children) {
                len = Math.max(1 + maxDepth(node), len);
            }
        }
        return len;
    }
}
