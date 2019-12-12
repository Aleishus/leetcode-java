package tree;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Tree2str {

    public String tree2str( TreeNode t ) {
      if(t==null){
          return "";
      }
      if(t.right==null && t.left == null){
          return t.val+"";
      }
      if(t.right==null){
          return t.val+"("+tree2str(t.left)+")";
      }

      return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
    }


    private String preOrder( int depth, TreeNode t ) {
        if (t == null) {
            return "()";
        }
        String left = preOrder(depth + 1, t.left);
        String right = preOrder(depth + 1, t.right);

        if (right.equals("()") && left.equals("()")) {
            right = "";
            left = "";
        } else if (right.equals("()")) {
            right = "";
        }
        if (depth == 1) {
            return t.val + left + right;
        }
        return "(" + t.val + left + right + ")";
    }

    public static void main( String[] args ) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r3.right = r5;

        System.out.println(new Tree2str().tree2str(r1));
    }
}
