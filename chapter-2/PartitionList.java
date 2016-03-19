import java.util.*;

public class PartitionList {
  public static void main(String[] args) {
    LinkedListNode head = new LinkedListNode(1);
    head.appendToTail(6);
    head.appendToTail(5);
    head.appendToTail(3);
    head.appendToTail(4);
    head.appendToTail(2);

    LinkedListNode runner = head;

    partitionList(head, 3);
    while(runner != null){
      System.out.println(runner.data);
      runner = runner.next;
    }
  }

  private static void partitionList(LinkedListNode head, int pivot){
    LinkedListNode current = head;

    while(current != null && current.data != pivot){
      if((int)current.data < pivot){
        current = current.next;
      }else{
        moveToEnd(current);
      }
    }
    // found the pivot
    current = current.next;

    while(current != null){
      if((int)current.data < pivot){
        moveToFront(current, head);
      }else{
        current = current.next;
      }
    }
  }

  private static void moveToEnd(LinkedListNode node){
    LinkedListNode newNode = new LinkedListNode(node.data);

    if(node.next != null){
      node.data = node.next.data;
      node.next = node.next.next;
    }

    LinkedListNode current = node;
    while(current.next != null){
      current = current.next;
    }

    current.next = newNode;
  }

  private static void moveToFront(LinkedListNode node, LinkedListNode head){
    LinkedListNode newNode = new LinkedListNode(node.data);
    newNode.next = head.next;
    head.next = newNode;
    Object tmpVal = head.data;
    head.data = newNode.data;
    newNode.data = tmpVal;

    if(node.next != null){
      node.data = node.next.data;
      node.next = node.next.next;
    }
  }
}
