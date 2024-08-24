package Queue;
import java.util.*;
class PriorityQueue{
    ArrayList<Integer> data ;
    public PriorityQueue(){
        data = new ArrayList<>();
    }
    public void add(int val){
        data.add(val);
        unHeapify(data.size()-1);

    }
    public void unHeapify(int i){
        if(i==0){
            return;
        }
        int pi=(i-1)/2;
        if(data.get(pi)>data.get(i)){
            swap(i,pi);
            unHeapify(pi);
        }
    }
    public void swap(int i,int j){
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i,jth);
        data.set(j,ith);
    }
    public int remove(){
        if(this.size()==0){
            System.out.println("underflow");
            return -1;
        }
        // swap element with last indexed element
        swap(0,data.size()-1);
        downHeapify(0);
        int val = data.remove(data.size()-1);
        return val;

    }
    private void downHeapify(int pi){
        int min = pi;

        int li = 2 * pi + 1;
        if(li<data.size() && data.get(pi)>data.get(li)){
            min = li;
        }
        int ri = 2 * pi + 2;
        if(ri<data.size() && data.get(pi)>data.get(ri)){
            min = ri;
        }
        if(min!=pi){
            swap(pi,min);
            downHeapify(min);
        }
    }

    public int peek(){
        if(this.size()==0){
            System.out.println("underflow");
            return -1;
        }
        return data.get(0);

    }
    public int size(){
        return data.size();
    }
    public void display(){
        for (int val: data) {
            System.out.print(val+"->");
        }
        System.out.println();

    }
}


public class Priority_queue_using_Heap {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(13);
        pq.add(14);
        pq.add(30);
        pq.add(2);

pq.display();
pq.remove();
pq.display();
pq.add(1);
pq.display();
    }
}
