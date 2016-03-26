import java.util.*;

public class PathExists{
  public static void main(String[] args){
    GraphNode<Integer> start = new GraphNode<Integer>(1);
    GraphNode<Integer> neighbor = start.addConnection(4);
    neighbor = neighbor.addConnection(5);
    neighbor = neighbor.addConnection(6);
    neighbor = neighbor.addConnection(7);

    System.out.println(pathExists(start, neighbor) == true);
    System.out.println(pathExists(start, new GraphNode<Integer>(55)) == false);
  }

  private static boolean pathExists(GraphNode<Integer> start, GraphNode<Integer> end){
    if(start == null || end == null)
      return false;

    Set<GraphNode> visited = new HashSet<GraphNode>();

    return pathExists(start, end, visited);
  }

  private static boolean pathExists(GraphNode<Integer> start, GraphNode<Integer> end, Set<GraphNode> visited){
    if(start == null || end == null)
      return false;

    visited.add(start);

    if(start == end)
      return true;
    else{
      for(GraphNode child : start.neighbors){
        if(!visited.contains(child)){
          if(pathExists(child, end, visited))
            return true;
        }
      }

      return false;
    }
  }
}
