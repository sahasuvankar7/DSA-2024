package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class custom_queue {
  protected int [] data;
  private static final int DEFAULT_SIZE = 10;
  int end = 0;

  public custom_queue(){
      this(DEFAULT_SIZE);
  }
  public custom_queue(int size){
    this.data = new int[size];
  }
  public boolean isFull(){
    return end == data.length;
  }
  public boolean isEmpty(){
    return end==0;
  }

  public boolean insert(int item){
    if(isFull()){
      System.out.println("Can't not insert, empty queue");
      return false;
    }
    data[end]=item;
    end++;
    return true;
  }

  public int  remove(){
    if(isEmpty()){
      System.out.println("empty queue");
    }
    // shift the element to left
    int removed = data[0];
    for (int i = 1; i <end ; i++) {
        data[i-1] = data[i]; // remove ele from front
    }
    end--;
    return removed;
  }

  public int front(){
    if(isEmpty()){
      System.out.println("empty queue");
    }
    return data[0];
  }
  public void display(){

    for (int i = 0; i <end; i++) {
      System.out.print(data[i]+" ");
    }
    System.out.println("END");
//    return true;
//
  }
  public static void main(String[] args) {
    custom_queue cq = new custom_queue(10);
    Queue<Integer> queue = new LinkedList<>();// queue basically implements linkedlist class
    cq.insert(22);
    cq.insert(23);
    cq.insert(24);
    cq.insert(25);
    cq.insert(26);

    System.out.println(cq.remove());
    System.out.println(cq.remove());
    System.out.println(cq.remove());
    System.out.println(cq.remove());
    System.out.println(cq.remove());
    System.out.println(cq.remove());
//        System.out.println(cq.front());
    cq.display();
  }

}
