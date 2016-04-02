import java.util.*;

public class ReverseLinkedList {
  public static void main(String[] args) {
    LinkedListNode head = new LinkedListNode(5);
    head.appendToTail(4);
    head.appendToTail(3);
    head.appendToTail(2);
    head.appendToTail(1);

    LinkedListNode newHead = reverse(head);

    while(newHead != null){
      System.out.println(newHead.data);
      newHead = newHead.next;
    }
  }

  public static LinkedListNode reverse(LinkedListNode head){
    if(head.next == null)
      return head;

    LinkedListNode second = head.next;
    head.next = null;

    LinkedListNode newHead = reverse(second);
    second.next = head;

    return newHead;
  }

}

