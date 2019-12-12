package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class AverageOfLevels {


    public List<Double> averageOfLevels( TreeNode root ) {

        List<Ref> sum = new ArrayList<>(16);
        preOrder(root, 0, sum);
        List<Double> res = new ArrayList<>(sum.size());
        for (Ref r : sum) {
            res.add(( r.sum / r.count ));
        }
        return res;
    }


    private void preOrder( TreeNode node, int level, List<Ref> sum ) {
        if (node != null) {
            if (level > sum.size() - 1) {
                sum.add(level, new Ref(1, node.val));
            } else {
                Ref r = sum.get(level);
                r.count += 1;
                r.sum += node.val;
            }
            preOrder(node.left, level + 1, sum);
            preOrder(node.right, level + 1, sum);
        }

    }

    class Ref {

        int count = 0;
        double sum = 0.0;

        public Ref( int count, double sum ) {
            this.count = count;
            this.sum = sum;
        }
    }

}
