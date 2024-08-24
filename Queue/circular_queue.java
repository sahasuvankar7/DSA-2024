package Queue;
class circularQueue{
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    private int size = 0;
    // making constructor for manual size
    public circularQueue(int size){
        this.data = new int[size];
    }
    // making constructor for fixed size
   public circularQueue(){
        this(DEFAULT_SIZE);
   }
   public boolean isFull(){
        return size==data.length;
   }
   public boolean isEmpty(){
        return size == 0;
   }
   public boolean insert(int item){
        if(isFull()){
            System.out.println("already full");
            return false;
        }
        data[end++]= item;
        end = end %data.length;
        size++;
        return true;
   }
   public int remove(){
        if(isEmpty()){
            System.out.println("already empty");
            return 0;
        }
        // front will be moving forward
        int remove = data[front++];
       front = front % data.length;
       // and size must be decreased
        size--;

        return remove;
   }
   public int front() throws Exception{ // exception handling signature
        if(isEmpty()){
            throw new Exception("empty queue");
        }
        return data[front];
   }
   public int end() throws Exception{
        if(isEmpty()){
            throw new Exception("empty queue");
        }
        return data[end];
   }
    public void display(){

        for (int i = front; i <end; i++) {
            System.out.print(data[i]+" ");
        }

//    return true;
//
    }
}
public class circular_queue {
    public static void main(String[] args) {
        circularQueue cq = new circularQueue();
        cq.insert(12);
        cq.insert(13);
        cq.insert(14);
        cq.insert(15);
        cq.insert(16);

        cq.display();

    }
}
