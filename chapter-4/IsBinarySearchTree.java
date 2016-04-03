import java.util.*;

public class IsBinarySearchTree {
  public static void main(String[] args){
    TreeNode<Integer> root = new TreeNode<Integer>(2);
    root.left = new TreeNode<Integer>(1);
    root.right = new TreeNode<Integer>(3);

    System.out.println(isBinarySearchTree(root) == true);
  }

  private static boolean isBinarySearchTree(TreeNode<Integer> root){
    List<Integer> visited = new ArrayList<Integer>();
    inOrderTraversal(root, visited);

    return isListSorted(visited);
  }

  private static void inOrderTraversal(TreeNode<Integer> root, List<Integer> visited){
    if(root.left != null)
      inOrderTraversal(root.left, visited);

    visited.add(root.data);

    if(root.right != null)
      inOrderTraversal(root.right, visited);
  }

  private static boolean isListSorted(List<Integer> list){
    Iterator<Integer> iterator = list.iterator();
    Integer current = iterator.next();

    while(iterator.hasNext()) {
      Integer next = iterator.next();

      if(current > next)
        return false;

      current = next;
    }

    return true;
  }
}
