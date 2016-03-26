import java.util.*;

public class ListOfListsFromTree{
  public static void main(String[] args){
    TreeNode<Integer> root = new TreeNode<Integer>(1);
    root.left = new TreeNode<Integer>(2);
    root.right = new TreeNode<Integer>(3);

    Map<Integer, List<Integer>> map = buildLists(root);

    System.out.println(map.get(0).size() == 1);
    System.out.println(map.get(0).get(0) == 1);

    System.out.println(map.get(1).size() == 2);
    System.out.println(map.get(1).get(0) == 2);
    System.out.println(map.get(1).get(1) == 3);
  }

  private static Map<Integer, List<Integer>> buildLists(TreeNode root){
    Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

    return buildLists(root, 0, map);
  }

  private static Map<Integer, List<Integer>> buildLists(TreeNode root, int height, Map<Integer, List<Integer>> map){
    List<Integer> levelList = map.get(height);
    if(levelList != null)
      levelList.add((Integer)root.data);
    else{
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add((Integer)root.data);
      map.put(height, list);
    }

    if(root.left != null)
      buildLists(root.left, height + 1, map);
    if(root.right != null)
      buildLists(root.right, height + 1, map);

    return map;
  }
}
