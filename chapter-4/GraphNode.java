import java.util.*;

public class GraphNode<T> {
  public T data;
  public List<GraphNode<T>> neighbors;

  public GraphNode(T d) {
    data = d;
    neighbors = new LinkedList<GraphNode<T>>();
  }

  public GraphNode<T> addConnection(T d){
    GraphNode<T> newNode = new GraphNode<T>(d);

    neighbors.add(newNode);
    return newNode;
  }
}
