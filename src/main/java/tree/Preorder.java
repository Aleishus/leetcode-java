package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Preorder {


    public List<Integer> preorder( Node root ) {
        List<Integer> order = new ArrayList<>(10);
        if (root != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            Node tmp;
            while (!stack.isEmpty()) {
                tmp = stack.pop();
                order.add(tmp.val);
                if (tmp.children != null) {
                    for (int i = tmp.children.size() - 1; i >= 0; i--) {
                        stack.push(tmp.children.get(i));
                    }
                }
            }
        }
        return order;
    }


    public static void main( String[] args ) {

        Node node2 = new Node(2, null);
        Node node4 = new Node(4, null);
        Node node5 = new Node(5, null);
        Node node6 = new Node(6, null);
        Node node3 = new Node(3, new ArrayList<Node>() {{
            add(node5);
            add(node6);
        }});
        Node node1 = new Node(1, new ArrayList<Node>() {{
            add(node3);
            add(node2);
            add(node4);
        }});

        System.out.println(new Preorder().preorder(node1));
    }

}
