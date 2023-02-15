package Queue;

public class QueueMain {

  public static void main(String[] args) throws Exception{
    CustomQueue queue=new CustomQueue(5);
    queue.insert(5);
    queue.insert(2);
    queue.insert(34);
    queue.insert(23);
    queue.insert(35);

    queue.display();
    System.out.println(queue.remove());
    queue.display();

  }

}
