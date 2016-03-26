public class BalancedTree {
  public static void main(String[] args){
    TreeNode<Integer> root = new TreeNode<Integer>(1);
    root.left = new TreeNode<Integer>(2);
    root.right = new TreeNode<Integer>(3);

    root.right.right = new TreeNode<Integer>(4);
    root.right.right.right = new TreeNode<Integer>(5);

    System.out.println(treeIsBalanced(root) == false);
  }

  private static boolean treeIsBalanced(TreeNode root){
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return Math.abs(leftHeight - rightHeight) <= 1;
  }

  private static int height(TreeNode root){
    if(root == null || (root.left == null && root.right == null))
      return 0;
    else
      return Math.max(height(root.left), height(root.right)) + 1;
  }
}
