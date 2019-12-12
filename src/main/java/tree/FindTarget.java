package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class FindTarget {

    List<Integer> backup = new ArrayList<>(16);

    public boolean findTarget( TreeNode root, int k ) {
        midOrder(root);
        int head = 0, rear = backup.size() - 1;
        while (head < rear) {
            if (backup.get(head) + backup.get(rear) == k) {
                return true;
            } else if (backup.get(head) + backup.get(rear) < k) {
                head++;
            } else {
                rear--;
            }
        }
        return false;
    }

    private void midOrder( TreeNode root ) {
        if (root != null) {
            midOrder(root.left);
            backup.add(root.val);
            midOrder(root.right);
        }
    }


}
