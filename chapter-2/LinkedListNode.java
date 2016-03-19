public class LinkedListNode {
  public Object data;
  public LinkedListNode next;

  public LinkedListNode(Object d){
    data = d;
  }

  public void appendToTail(Object d){
    LinkedListNode node = new LinkedListNode(d);

    LinkedListNode current = this;

    while(current.next != null){
      current = current.next;
    }

    current.next = node;
  }

  public int size() {
    int count = 1;

    LinkedListNode runner = this;
    while(runner.next != null) {
      runner = runner.next;
      count++;
    }

    return count;
  }

  public boolean contains(Object d) {
    LinkedListNode runner = this;

    while(runner != null) {
      if(runner.data == d)
        return true;
      runner = runner.next;
    }

    return false;
  }
}
