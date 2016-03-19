import java.util.*;

public class RemoveDupes {
  public static void main(String[] args) {
    LinkedListNode head = new LinkedListNode(1);
    head.appendToTail(2);
    head.appendToTail(6);
    head.appendToTail(3);
    head.appendToTail(4);
    head.appendToTail(6);
    head.appendToTail(5);

    LinkedListNode runner = head;

    removeDupes(head);
    System.out.println(head.size() == 6);
    System.out.println(head.contains(1));
    System.out.println(head.contains(2));
    System.out.println(head.contains(3));
    System.out.println(head.contains(4));
    System.out.println(head.contains(5));
    System.out.println(head.contains(6));

    head.appendToTail(6);
    head.appendToTail(9);

    removeDupesNSquared(head);
    System.out.println(head.size() == 7);
    System.out.println(head.contains(1));
    System.out.println(head.contains(2));
    System.out.println(head.contains(3));
    System.out.println(head.contains(4));
    System.out.println(head.contains(5));
    System.out.println(head.contains(6));
    System.out.println(head.contains(9));
  }

  public static void removeDupes(LinkedListNode head){
    if (head == null)
      return;

    Set<Object> encounteredNodes = new HashSet<Object>();
    encounteredNodes.add(head.data);

    LinkedListNode runner = head.next;

    while(runner != null) {
      if(encounteredNodes.contains(runner.data))
        removeNode(runner);
      else
        encounteredNodes.add(runner.data);

      runner = runner.next;
    }
  }

  public static void removeDupesNSquared(LinkedListNode node){
    if (node == null)
      return;

    LinkedListNode current = node;

    while(current != null){
      LinkedListNode runner = current.next;

      while(runner != null){
        if(runner.data == current.data)
          removeNode(runner);
        else
          runner = runner.next;
      }

      current = current.next;
    }
  }

  private static void removeNode(LinkedListNode node){
    if(node.next != null){
      node.data = node.next.data;
      node.next = node.next.next;
    }
  }

}

