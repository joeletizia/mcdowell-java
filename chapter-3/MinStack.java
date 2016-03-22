import java.util.*;

public class MinStack {
  private ArrayList<MinNode> nodes = new ArrayList<MinNode>();

  public void enqueue(int data){
    int currentMin;
    if(nodes.size() == 0)
      currentMin = Integer.MAX_VALUE;
    else
      currentMin = nodes.get(0).stackMin;

    MinNode newNode;

    if(data < currentMin)
      newNode = new MinNode(data, data);
    else
      newNode = new MinNode(data, currentMin);

    nodes.add(0, newNode);
    return;
  }

  public int dequeue(){
    return nodes.remove(0).data;
  }

  public int min(){
    return nodes.get(0).stackMin;
  }

  private class MinNode{
    public int data;
    public int stackMin;

    public MinNode(int d, int min){
      data = d;
      stackMin = min;
    }

    public int min(){
      return stackMin;
    }
  }
}

