public class ConstantMinStack {

  public static void main(String[] args) {
    MinStack stack = new MinStack();
    stack.enqueue(2);
    System.out.println(stack.min() == 2);
    stack.enqueue(3);
    System.out.println(stack.min() == 2);

    stack.enqueue(1);
    System.out.println(stack.min() == 1);
    System.out.println(stack.dequeue() == 1);
    System.out.println(stack.min() == 2);
  }
}
