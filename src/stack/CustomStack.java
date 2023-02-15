package stack;

import java.sql.SQLOutput;

public class CustomStack {
    protected  int[] data;
    private static  final int DEFAULT_SIZE = 10;
    int ptr = -1;
    // when no input size given
    public CustomStack(){
      this(DEFAULT_SIZE);
    }
    // when input size given
    public CustomStack(int size){
      this.data = new int[size];
    }
    public boolean push(int item){
      if (isFull()){
        System.out.println("Stack is full");
        return false;
      }
      ptr++;
      data[ptr] = item;
      return true;
    }
    public int pop() throws StackException{
      if(isEmpty()){
        throw new StackException("Cannot pop from empty stack");
      }
      int removedItem = data[ptr];
      ptr--;
      return removedItem;
    }
    public int peek() throws StackException{
      if(isEmpty()){
        throw new StackException("Cannot peek from empty stack");
      }
      return data[ptr];
    }
  private boolean isFull() {
      // check if pointer is at last index and return the logical result
      return ptr == data.length -1;
  }
  private boolean isEmpty() {
    // check if pointer is at -1 and return the logical result
    return ptr == -1;
  }
}
