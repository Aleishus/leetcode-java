package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Postorder {

    private List<Integer> order;

    public List<Integer> postorder( Node root ) {
        order = new ArrayList<>(10);
        find(root);
        return order;
    }


    private void find( Node node ) {
        if (node != null) {
            if (node.children != null) {
                for (Node t : node.children) {
                    find(t);
                }
            }
            order.add(node.val);
        }
    }

}
