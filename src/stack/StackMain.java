package stack;

public class StackMain {

  public static void main(String[] args) throws StackException {
        CustomStack stack= new CustomStack(5);

        stack.push(34);
        stack.push(25);
        stack.push(235);
        stack.push(314);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

  }

}
