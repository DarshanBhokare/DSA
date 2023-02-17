package stack;

import java.util.Stack;

class ImplementQueueUsingStack {
  private Stack<Integer> stackMain;
  private Stack<Integer> stackTwo;
  public ImplementQueueUsingStack() {
    this.stackMain= new Stack<Integer>();
    this.stackTwo= new Stack<Integer>();
  }

  public void push(int x) {
    while(!stackMain.isEmpty()){
      stackTwo.push(stackMain.pop());
    }
    stackMain.push(x);
    while(!stackTwo.isEmpty()){
      stackMain.push(stackTwo.pop());
    }
  }

  public int pop() {
    return stackMain.pop();
  }

  public int peek() {
    return stackMain.peek();
  }

  public boolean empty() {
    return stackMain.isEmpty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// without using stack
//public class ImplementQueueUsingStack {
//  int front;
//  int end;
//  int[] data;
//  public ImplementQueueUsingStack() {
//    this.front=0;
//    this.end=-1;
//    this.data=new int[101];
//  }
//
//  public void push(int x) {
//    data[++end]=x;
//  }
//
//  public int pop() {
//    int removedItem = data[front];
//    for(int i=0;i<=end;i++){
//      data[i]=data[i+1];
//    }
//    end--;
//    return removedItem;
//  }
//
//  public int peek() {
//    return data[front];
//  }
//
//  public boolean empty() {
//    if(end>-1)
//      return false;
//    return true;
//  }
//}
//
///**
// * Your MyQueue object will be instantiated and called as such:
// * MyQueue obj = new MyQueue();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.peek();
// * boolean param_4 = obj.empty();
// */