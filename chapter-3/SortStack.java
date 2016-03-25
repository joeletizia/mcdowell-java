import java.util.Stack;

public class SortStack {
  public static void main(String[] args){
    Stack stack = new Stack();

    stack.push(1);
    stack.push(3);
    stack.push(2);
    stack.push(2);
    stack.push(5);

    sortStack(stack);

    System.out.println(stack.pop() == 5);
    System.out.println(stack.pop() == 3);
    System.out.println(stack.pop() == 2);
    System.out.println(stack.pop() == 2);
    System.out.println(stack.pop() == 1);
  }

  private static void sortStack(Stack stack) { 
    Stack tmpStack = new Stack();

    while(stack.empty() == false){
      if(tmpStack.empty() == true || (int)tmpStack.peek() >= (int)stack.peek()){
        tmpStack.push(stack.pop());
      }
      else{
        int elementToMove = (int)stack.pop();

        while(tmpStack.empty() == false){
          if(elementToMove >= (int)tmpStack.peek()){
            stack.push(tmpStack.pop());
            stack.push(elementToMove);
            break;
          }
          else{
            tmpStack.push(stack.pop());
          }
        }
      }
    }

    while(tmpStack.empty() == false){
      stack.push(tmpStack.pop());
    }
  }
}
